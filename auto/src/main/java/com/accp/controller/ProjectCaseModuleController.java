package com.accp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.ProjectCaseModule;
import com.accp.domain.SysProject;
import com.accp.service.ProjectCaseModuleService;

@Controller
@RequestMapping("/projectCaseModule")
public class ProjectCaseModuleController {

	@Autowired
	ProjectCaseModuleService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public List<ProjectCaseModule> find(String moduleName,String projectId){
		return service.findByRoleId(moduleName,projectId);
	}
	
	@RequestMapping("/findProject")
	@ResponseBody
	public List<SysProject> findProject(){
		return service.findProject();
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public int create(ProjectCaseModule projectCaseModule) {
		return service.create(projectCaseModule);
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public int remove(Integer moduleId) {
		return service.remove(moduleId);
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public ProjectCaseModule findById(Integer parentId) {
		return service.findById(parentId);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(ProjectCaseModule projectCaseModule) {
		return service.update(projectCaseModule);
	}
	
	@RequestMapping("/studentDownload")
	public ResponseEntity<byte []> donwload(){
		HttpHeaders headers =new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		try {
			String classpath = ProjectCaseModuleController.class.getResource("/").getPath();
			File file = new File(classpath + "/download/1596093630788.xlsx");
			
			InputStream is = new FileInputStream(file);
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			
			String fileName=new String("用例模板.xlsx".getBytes("utf-8"),"iso-8859-1");
			headers.setContentDispositionFormData("attachment", fileName);
			
			return 	new ResponseEntity<byte []>(bytes,headers,HttpStatus.OK); 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	@RequestMapping("/upalodExcel")
	public String uploadExcel(MultipartFile file) {
		try {
			  InputStream is = file.getInputStream();//提取传入过来的文件字节
	            //HSSFWorkbook hss = new HSSFWorkbook();
	            //将文件转换成excel
	            XSSFWorkbook w = new XSSFWorkbook(is);
	            int sheets = w.getNumberOfSheets();//获取excel中的sheet页的个数
	            Sheet sheet = w.getSheetAt(0);
	            int rows = sheet.getPhysicalNumberOfRows();//获取excel中当前sheet页中有多少行
	            for(int i=1;i<rows;i++){
	            	ProjectCaseModule projectCaseModule = new ProjectCaseModule();
	                Row row = sheet.getRow(i);
	                String projectName = row.getCell(0).getStringCellValue();
	                String moduleName = row.getCell(1).getStringCellValue();
	                String ancestors = row.getCell(2).getStringCellValue();
	                Integer orderNum = (int) row.getCell(3).getNumericCellValue();
	                String remark = row.getCell(4).getStringCellValue();
	                projectCaseModule.setCreateTime(new Date());
	                projectCaseModule.setModuleName(moduleName);
	                projectCaseModule.setAncestors(ancestors);
	                projectCaseModule.setOrderNum(orderNum);
	                projectCaseModule.setRemark(remark);
	                projectCaseModule.setProjectId(service.projectId(projectName));
	                projectCaseModule.setParentId(Integer.parseInt(ancestors.substring((ancestors.lastIndexOf(",")+1),ancestors.length())));
	                service.create(projectCaseModule);
	            }
	            return  "redirect:http://127.0.0.1:8020/automatic/automatic/yonglimukuai.html";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return  "redirect:http://127.0.0.1:8020/automatic/automatic/yonglimukuai.html";
	}
}
