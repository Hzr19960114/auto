package com.accp.controller;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpSession;

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

import com.accp.domain.SysDictType;
import com.accp.service.SysDictTypeService;
import com.github.pagehelper.PageInfo;


@Controller
@RequestMapping("/sysDictType")
public class SysDictTypeController {

	@Autowired
	SysDictTypeService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysDictType> find(Integer page,Integer limit,String dictName,String dictType,String status,String createTime,String updateTime){
		return service.find(page,limit,dictName,dictType,status,createTime,updateTime);
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public int remove(Integer dictId) {
		return service.remove(dictId);
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public int removeList(@RequestBody List<SysDictType> sysDictType) {
		return service.removeList(sysDictType);
	}
	
	@RequestMapping("/exportExcel")
	@ResponseBody
	public ResponseEntity<byte []> exportExcel(String dictName,String dictType,String status,String createTime,String updateTime){
		try {
			List<SysDictType> list =service.findAll(dictName, dictType, status, createTime, updateTime);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellId = titleRow.createCell(0);
			cellId.setCellValue("字典主键");
			Cell cellName = titleRow.createCell(1);
			cellName.setCellValue("字典名称");
			Cell cellType = titleRow.createCell(2);
			cellType.setCellValue("字典类型");
			Cell cellStatus = titleRow.createCell(3);
			cellStatus.setCellValue("状态");
			
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				Cell dictId = row.createCell(0);
				dictId.setCellValue(list.get(i).getDictId());
				Cell dictName1 = row.createCell(1);
				dictName1.setCellValue(list.get(i).getDictName());
				Cell dictType2 = row.createCell(2);
				dictType2.setCellValue(list.get(i).getDictType());
				Cell status3 = row.createCell(3);
				status3.setCellValue(list.get(i).getStatus().equals("0")?"正常":"停用");
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("字典类型.xlsx".getBytes("utf-8"),"iso-8859-1");
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
	
	@RequestMapping("/create")
	@ResponseBody
	public int create(SysDictType sysDictType) {
		return service.create(sysDictType);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(SysDictType sysDictType) {
		return service.update(sysDictType);
	}
	
	@RequestMapping("/finds")
	@ResponseBody
	public List<SysDictType> find(HttpSession session){
		return service.find();
	}
}
