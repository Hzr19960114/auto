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

import com.accp.domain.SysJobLog;
import com.accp.service.SysJobLogService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/sysJobLog")
public class SysJobLogController {

	@Autowired
	SysJobLogService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysJobLog> find(Integer page,Integer limit,String jobName,String methodName,String status,@DateTimeFormat(pattern="yyyy-MM-dd") Date createTime,@DateTimeFormat(pattern="yyyy-MM-dd") Date updateTime){
		return service.find(page, limit,jobName,methodName,status,createTime,updateTime);
		
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public int removeList(@RequestBody List<SysJobLog> list) {
		return service.removeList(list);
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public int remove(Integer id) {
		return service.remove(id);
	}
	
	@RequestMapping("/removeFind")
	@ResponseBody
	public int removeFind() {
		return service.removeFind();
	}
	
	@RequestMapping("/exportExcel")
	@ResponseBody
	public ResponseEntity<byte []> exportExcel(String jobName,String methodName,String status,@DateTimeFormat(pattern="yyyy-MM-dd") Date createTime,@DateTimeFormat(pattern="yyyy-MM-dd") Date updateTime){
		try {
			List<SysJobLog> list =service.findAll(jobName,methodName,status,createTime,updateTime);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellId = titleRow.createCell(0);
			cellId.setCellValue("日志序号");
			Cell cellName = titleRow.createCell(1);
			cellName.setCellValue("任务名称");
			Cell cellGroup = titleRow.createCell(2);
			cellGroup.setCellValue("任务组名");
			Cell cellMethodName = titleRow.createCell(3);
			cellMethodName.setCellValue("任务方法");
			Cell cellMethodParams = titleRow.createCell(4);
			cellMethodParams.setCellValue("方法参数");
			Cell cellMessage = titleRow.createCell(5);
			cellMessage.setCellValue("日志信息");
			Cell cellStatus = titleRow.createCell(6);
			cellStatus.setCellValue("执行状态");
			Cell cellInfo = titleRow.createCell(7);
			cellInfo.setCellValue("异常信息");
			
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				Cell dictId = row.createCell(0);
				dictId.setCellValue(list.get(i).getJobLogId());
				Cell dictName1 = row.createCell(1);
				dictName1.setCellValue(list.get(i).getJobName());
				Cell dictType2 = row.createCell(2);
				dictType2.setCellValue(list.get(i).getJobGroup());
				Cell methodName1 = row.createCell(3);
				methodName1.setCellValue(list.get(i).getMethodName());
				Cell methodParams = row.createCell(4);
				methodParams.setCellValue(list.get(i).getMethodParams());
				Cell message = row.createCell(5);
				message.setCellValue(list.get(i).getJobMessage());
				Cell status3 = row.createCell(6);
				status3.setCellValue(list.get(i).getStatus().equals("0")?"成功":"失败");
				Cell info = row.createCell(7);
				info.setCellValue(list.get(i).getExceptionInfo());
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("调度日志.xlsx".getBytes("utf-8"),"iso-8859-1");
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
