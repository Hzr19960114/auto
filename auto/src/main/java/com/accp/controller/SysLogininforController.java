package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysLogininfor;
import com.accp.service.SysLogininforService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/sysLogininfor")
public class SysLogininforController {

	@Autowired
	SysLogininforService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysLogininfor> find(Integer page,Integer limit,String loginName,String ipaddr,String status,@DateTimeFormat(pattern="yyyy-MM-dd") Date createTime,@DateTimeFormat(pattern="yyyy-MM-dd") Date updateTime){
		return service.find(page, limit,loginName,ipaddr,status,createTime,updateTime);
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public int removeList(@RequestBody List<SysLogininfor> list) {
		return service.removeList(list);
	}
	
	@RequestMapping("/removeFind")
	@ResponseBody
	public int removeFind() {
		return service.removeFind();
	}
	
	@RequestMapping("/exportExcel")
	@ResponseBody
	public ResponseEntity<byte []> exportExcel(String loginName,String ipaddr,String status,@DateTimeFormat(pattern="yyyy-MM-dd") Date createTime,@DateTimeFormat(pattern="yyyy-MM-dd") Date updateTime){
		try {
			List<SysLogininfor> list =service.findAll(loginName,ipaddr,status,createTime,updateTime);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellId = titleRow.createCell(0);
			cellId.setCellValue("序号");
			Cell cellName = titleRow.createCell(1);
			cellName.setCellValue("用户账号");
			Cell cellGroup = titleRow.createCell(2);
			cellGroup.setCellValue("登录状态");
			Cell cellMethodName = titleRow.createCell(3);
			cellMethodName.setCellValue("登录地址");
			Cell cellMethodParams = titleRow.createCell(4);
			cellMethodParams.setCellValue("登录地点");
			Cell cellMessage = titleRow.createCell(5);
			cellMessage.setCellValue("浏览器");
			Cell cellStatus = titleRow.createCell(6);
			cellStatus.setCellValue("操作系统 ");
			Cell cellInfo = titleRow.createCell(7);
			cellInfo.setCellValue("提示消息");
			Cell cellTime = titleRow.createCell(8);
			cellTime.setCellValue("访问时间");
			
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				Cell dictId = row.createCell(0);
				dictId.setCellValue(list.get(i).getInfoId());
				Cell dictName1 = row.createCell(1);
				dictName1.setCellValue(list.get(i).getLoginName());
				Cell dictType2 = row.createCell(2);
				dictType2.setCellValue(list.get(i).getIpaddr());
				Cell methodName1 = row.createCell(3);
				methodName1.setCellValue(list.get(i).getLoginLocation());
				Cell methodParams = row.createCell(4);
				methodParams.setCellValue(list.get(i).getBrowser());
				Cell message = row.createCell(5);
				message.setCellValue(list.get(i).getOs());
				Cell status3 = row.createCell(6);
				status3.setCellValue(list.get(i).getStatus().equals("0")?"登录成功":"登录失败");
				Cell info = row.createCell(7);
				info.setCellValue(list.get(i).getMsg());
				Cell time = row.createCell(8);
				time.setCellValue(list.get(i).getLoginTime());
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("登录日志.xlsx".getBytes("utf-8"),"iso-8859-1");
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
