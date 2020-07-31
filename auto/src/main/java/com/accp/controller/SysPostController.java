package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysPost;
import com.accp.service.SysPostService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/post")
public class SysPostController {

	@Autowired
	SysPostService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysPost> find(Integer page,Integer limit,SysPost syspost){
		return service.find(page, limit,syspost);
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(SysPost syspost) {
		int count = service.create(syspost);
		if(count>0) {
			return "新增成功!";
		}else {
			return "新增失败!";
		}
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(SysPost syspost) {
		int count = service.update(syspost);
		if(count>0) {
			return "修改成功!";
		}else {
			return "修改失败!";
		}
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public String remove(Integer postId) {
		int count = service.remove(postId);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
	
	@RequestMapping("/removeAll")
	@ResponseBody
	public String removeAll(@RequestBody List<SysPost> syspost) {
		int count = service.removeAll(syspost);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
	
	
	@RequestMapping("/exportExcel")
	@ResponseBody
	public ResponseEntity<byte []> exportExcel(SysPost syspost){
		try {
			List<SysPost> list =service.findAll(syspost);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellId = titleRow.createCell(0);
			cellId.setCellValue("岗位编号");
			Cell cellCode = titleRow.createCell(1);
			cellCode.setCellValue("岗位编码");
			Cell cellName = titleRow.createCell(2);
			cellName.setCellValue("岗位名称");
			Cell cellSort = titleRow.createCell(3);
			cellSort.setCellValue("显示顺序");
			Cell cellStatus = titleRow.createCell(4);
			cellStatus.setCellValue("状态");
			Cell cellCreateTime = titleRow.createCell(5);
			cellCreateTime.setCellValue("创建时间");
			Cell cellRemark = titleRow.createCell(6);
			cellRemark.setCellValue("备注");
			
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				Cell postId = row.createCell(0);
				postId.setCellValue(list.get(i).getPostId());
				Cell postCode = row.createCell(1);
				postCode.setCellValue(list.get(i).getPostCode());
				Cell postName = row.createCell(2);
				postName.setCellValue(list.get(i).getPostName());
				Cell postSort = row.createCell(3);
				postSort.setCellValue(list.get(i).getPostSort());
				Cell status = row.createCell(4);
				status.setCellValue(list.get(i).getStatus());
				Cell createTime = row.createCell(5);
				createTime.setCellValue(list.get(i).getCreateTime());
				Cell remark = row.createCell(6);
				remark.setCellValue(list.get(i).getRemark());
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("岗位管理.xlsx".getBytes("utf-8"),"iso-8859-1");
			headers.setContentDispositionFormData("attachment", excelName);
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			
			//文件流
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			//将excel写入到文件流中
			xss.write(bao);
			//将文件流转换成字节
			byte [] bytes = bao.toByteArray();
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
