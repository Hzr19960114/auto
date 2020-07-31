package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.SysUser;
import com.accp.domain.SysUserExample;
import com.accp.service.SysUserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/SysUserController")
public class SysUserController {
	 @Autowired 
	 SysUserService service;
	 //查找全部
	 @GetMapping("/findAll")
	 @ResponseBody
	 public List<com.accp.domain.SysUser> finAll(){
		 return service.finAll();
	 }

	 //分页数据
	 @GetMapping("/findByPage")
	 @ResponseBody
	 public PageInfo<SysUser> findByPage(Integer page,Integer limit
			 							 ,String login_name, String phonenumber
			 							 ,String status
			 							 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			return service.findByPage(page, limit, login_name,status, phonenumber, createtimenum1, createtimenum2);
	 }
	 //批量删除
	 @RequestMapping("/removeList")
	 @ResponseBody
	 public int removeLizst(@RequestBody List<SysUser> sysDictData) {
		 return service.removeList(sysDictData);
	 }
	 //新增
	 @PostMapping("/create")
	 public Integer create(com.accp.domain.SysUser user) {
		 return service.create(user);
	 }
	 //修改
	 @PostMapping("/update")
	 public Integer update(com.accp.domain.SysUser user) {
		 return service.update(user);
	 }
	 //删除
	 @DeleteMapping("/delete/{id}")
	 public Integer delete(@PathVariable("id")Integer id) {
		 System.out.println(id);
		 return service.delete(id);
	 }
	 //导出
	 @RequestMapping("/exportExcel")
		@ResponseBody
		public ResponseEntity<byte []> exportExcel(String login_name, String phonenumber
				,String status
				,String createtimenum1,String createtimenum2){
			try {
				List<SysUser> list =service.wherefind(login_name, phonenumber, status, createtimenum1, createtimenum2);
				//创建excel
				XSSFWorkbook xss = new XSSFWorkbook();
				//创建sheet页
				Sheet sheet = xss.createSheet();
				Row titleRow = sheet.createRow(0);
				Cell cellDictCode = titleRow.createCell(0);
				cellDictCode.setCellValue("用户ID");
				Cell cellDictSort = titleRow.createCell(1);
				cellDictSort.setCellValue("部门ID");
				Cell cellDictLabel = titleRow.createCell(2);
				cellDictLabel.setCellValue("登录账号");
				Cell cellDictValue = titleRow.createCell(3);
				cellDictValue.setCellValue("用户昵称");
				Cell cellDictType = titleRow.createCell(4);
				cellDictType.setCellValue("用户类型（00系统用户）");
				Cell cellCssClass = titleRow.createCell(5);
				cellCssClass.setCellValue("用户邮箱");
				Cell cellIsDefault = titleRow.createCell(6);
				cellIsDefault.setCellValue("手机号码");
				Cell cellStatus = titleRow.createCell(7);
				cellStatus.setCellValue("用户性别（0男 1女 2未知）");
				for(int i=0;i<list.size();i++) {
					Row row = sheet.createRow(i+1);
					Cell dictCode = row.createCell(0);
					dictCode.setCellValue(list.get(i).getUserId());
					Cell dictSort = row.createCell(1);
					dictSort.setCellValue(list.get(i).getDeptId()!=null?list.get(i).getDeptId():0);
					Cell dictLabel1 = row.createCell(2);
					dictLabel1.setCellValue(list.get(i).getLoginName()!=null?list.get(i).getLoginName():"");
					Cell dictValue = row.createCell(3);
					dictValue.setCellValue(list.get(i).getUserName()!=null?list.get(i).getUserName():"");
					Cell dictType1 = row.createCell(4);
					dictType1.setCellValue(list.get(i).getUserType());
					Cell cssClass = row.createCell(5);
					cssClass.setCellValue(list.get(i).getEmail());
					Cell isDefault = row.createCell(6);
					isDefault.setCellValue(list.get(i).getPhonenumber());
					Cell status1 = row.createCell(7);
					status1.setCellValue(list.get(i).getSex());
				}
				
				HttpHeaders headers = new HttpHeaders();
				String excelName = new String("用户数据.xlsx".getBytes("utf-8"),"iso-8859-1");
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
		//导入
		@RequestMapping("/upalodExcel")
		@ResponseBody
	    public String uploadExcel(MultipartFile file){
	        try {
	            InputStream is = file.getInputStream();//提取传入过来的文件字节
	            //HSSFWorkbook hss = new HSSFWorkbook();
	            //将文件转换成excel
	            XSSFWorkbook w = new XSSFWorkbook(is);
	            int sheets = w.getNumberOfSheets();//获取excel中的sheet页的个数
	            Sheet sheet = w.getSheetAt(0);

	            int rows = sheet.getPhysicalNumberOfRows();//获取excel中当前sheet页中有多少行
	            for(int i=1;i<rows;i++){
	            	SysUser user = new SysUser();
	                Row row = sheet.getRow(i);
	                int userid = (int)row.getCell(0).getNumericCellValue();
	                int dept_id = (int)row.getCell(1).getNumericCellValue();
	                String login_name = row.getCell(2).getStringCellValue();
	                String user_name = row.getCell(3).getStringCellValue();
	                String user_type = row.getCell(4).getStringCellValue();
	                String email = row.getCell(5).getStringCellValue();
	                String phonenumber = row.getCell(6).getStringCellValue();
	                String sex = row.getCell(7).getStringCellValue();
	                /*Date birthday = row.getCell(3).getDateCellValue();*/
	                user.setUserId(userid);
	                user.setDeptId(dept_id);
	                user.setLoginName(login_name);
	                user.setUserName(user_name);
	                user.setUserType(user_type);
	                user.setEmail(email);
	                user.setPhonenumber(phonenumber);
	                user.setSex(sex);
	                service.create(user);
	            }
	            return "00000";
	        } catch (IOException e) {
	            e.printStackTrace();
	            return "00001";
	        }
		}
}
