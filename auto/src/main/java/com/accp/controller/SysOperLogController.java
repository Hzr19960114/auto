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

import com.accp.domain.SysOperLog;
import com.accp.service.SysOperLogService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("operlog")
public class SysOperLogController {

	@Autowired
	SysOperLogService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysOperLog> find(Integer page,Integer limit,SysOperLog sysOperLog){
		return service.find(page,limit,sysOperLog);
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public int removeList(@RequestBody List<SysOperLog> list) {
		return service.removeList(list);
	}
	
	
	@RequestMapping("/removeFind")
	@ResponseBody
	public int removeFind() {
		return service.removeFind();
	}
	
	@RequestMapping("/exportExcel")
	@ResponseBody
	public ResponseEntity<byte []> exportExcel(SysOperLog sysOperLog){
		try {
			List<SysOperLog> list =service.findAll(sysOperLog);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellId = titleRow.createCell(0);
			cellId.setCellValue("日志编号");
			Cell cellName = titleRow.createCell(1);
			cellName.setCellValue("模块标题");
			Cell cellGroup = titleRow.createCell(2);
			cellGroup.setCellValue("业务类型");
			Cell cellMethodName = titleRow.createCell(3);
			cellMethodName.setCellValue("操作类别");
			Cell cellMethodParams = titleRow.createCell(4);
			cellMethodParams.setCellValue("操作人员");
			Cell cellMessage = titleRow.createCell(5);
			cellMessage.setCellValue("部门名称");
			Cell cellStatus = titleRow.createCell(6);
			cellStatus.setCellValue("操作状态");
			Cell cellInfo = titleRow.createCell(7);
			cellInfo.setCellValue("操作时间");
			
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				Cell dictId = row.createCell(0);
				dictId.setCellValue(list.get(i).getOperIp());
				Cell dictName1 = row.createCell(1);
				dictName1.setCellValue(list.get(i).getTitle());
				Cell dictType2 = row.createCell(2);
				if(list.get(i).getBusinessType()==0) {
					dictType2.setCellValue("其他");
				}else if(list.get(i).getBusinessType()==1) {
					dictType2.setCellValue("新增");
				}else if(list.get(i).getBusinessType()==2) {
					dictType2.setCellValue("修改");
				}else if(list.get(i).getBusinessType()==3) {
					dictType2.setCellValue("删除");
				}
				Cell methodName1 = row.createCell(3);
				if(list.get(i).getOperatorType()==0) {
					methodName1.setCellValue("其他");
				}else if(list.get(i).getOperatorType()==1) {
					methodName1.setCellValue("后台用户");
				}else if(list.get(i).getOperatorType()==2) {
					methodName1.setCellValue("手机端用户");
				}
				Cell methodParams = row.createCell(4);
				methodParams.setCellValue(list.get(i).getOperName());
				Cell message = row.createCell(5);
				message.setCellValue(list.get(i).getDeptName());
				Cell status3 = row.createCell(6);
				status3.setCellValue(list.get(i).getStatus().equals("0")?"成功":"失败");
				Cell info = row.createCell(7);
				info.setCellValue(list.get(i).getTitle());
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("操作日志.xlsx".getBytes("utf-8"),"iso-8859-1");
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
