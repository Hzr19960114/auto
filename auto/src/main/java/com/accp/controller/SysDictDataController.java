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

import com.accp.domain.SysDictData;
import com.accp.domain.SysDictType;
import com.accp.service.SysDictDataService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/sysDictData")
public class SysDictDataController {
	
	@Autowired 
	SysDictDataService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysDictData> find(Integer page,Integer limit,String dictType,String dictLabel,String status){
		return service.find(page, limit, dictType,dictLabel,status);
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public int remove(Integer dictCode) {
		return service.remove(dictCode);
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public int removeList(@RequestBody List<SysDictData> sysDictData) {
		return service.removeList(sysDictData);
	}
	
	@RequestMapping("/exportExcel")
	@ResponseBody
	public ResponseEntity<byte []> exportExcel(String dictLabel,String dictType,String status){
		try {
			List<SysDictData> list =service.findAll(dictLabel, dictType, status);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellDictCode = titleRow.createCell(0);
			cellDictCode.setCellValue("字典编码");
			Cell cellDictSort = titleRow.createCell(1);
			cellDictSort.setCellValue("字典排序");
			Cell cellDictLabel = titleRow.createCell(2);
			cellDictLabel.setCellValue("字典标签");
			Cell cellDictValue = titleRow.createCell(3);
			cellDictValue.setCellValue("字典键值");
			Cell cellDictType = titleRow.createCell(4);
			cellDictType.setCellValue("字典类型");
			Cell cellCssClass = titleRow.createCell(5);
			cellCssClass.setCellValue("字典样式");
			Cell cellIsDefault = titleRow.createCell(6);
			cellIsDefault.setCellValue("是否默认");
			Cell cellStatus = titleRow.createCell(7);
			cellStatus.setCellValue("状态");
			
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				Cell dictCode = row.createCell(0);
				dictCode.setCellValue(list.get(i).getDictCode());
				Cell dictSort = row.createCell(1);
				dictSort.setCellValue(list.get(i).getDictSort());
				Cell dictLabel1 = row.createCell(2);
				dictLabel1.setCellValue(list.get(i).getDictLabel());
				Cell dictValue = row.createCell(3);
				dictValue.setCellValue(list.get(i).getDictValue());
				Cell dictType1 = row.createCell(4);
				dictType1.setCellValue(list.get(i).getDictType());
				Cell cssClass = row.createCell(5);
				cssClass.setCellValue(list.get(i).getCssClass());
				Cell isDefault = row.createCell(6);
				isDefault.setCellValue(list.get(i).getIsDefault()=="Y"?"是":"否");
				Cell status1 = row.createCell(7);
				status1.setCellValue(list.get(i).getStatus()=="0"?"正常":"停用");
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("字典数据.xlsx".getBytes("utf-8"),"iso-8859-1");
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
	public int create(SysDictData sysDictData) {
		return service.create(sysDictData);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(SysDictData sysDictData) {
		return service.update(sysDictData);
	}
}
