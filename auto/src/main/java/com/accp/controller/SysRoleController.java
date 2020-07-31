package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import com.accp.domain.SysProject;
import com.accp.domain.SysRole;
import com.accp.domain.SysUser;
import com.accp.service.SysRoleService;
import com.accp.service.SysUserService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/SysRoleController")
public class SysRoleController {
	@Autowired 
	 SysRoleService service;
	 //分页数据
	 @GetMapping("/findByPage")
	 @ResponseBody
	 public PageInfo<SysRole> findByPage(Integer page,Integer limit
			 							 ,String roleName, String roleKey
			 							 ,String status
			 							 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			return service.findByPage(page, limit, roleName, roleKey, status,createtimenum1, createtimenum2);
	 }
	 //批量删除
	 @RequestMapping("/removeList")
	 @ResponseBody
	 public int removeList(@RequestBody List<SysRole> sysDictData) {
		 return service.removeList(sysDictData);
	 }
	 //查找全部
	 @GetMapping("/findAll")
	 @ResponseBody
	 public List<com.accp.domain.SysRole> finAll(){
		 return service.finAll();
	 }

	//新增项目角色表id
	 @RequestMapping("/createRoleidAndProid")
	 @ResponseBody
	 public Integer createRoleidAndProid(int rid,Integer [] proids) {
		 return service.createRoleidAndProid(rid, proids);
	 }
	 
	 //新增
	 @PostMapping("/create")
	 public Integer create(com.accp.domain.SysRole role,HttpSession session) {
		 SysUser user=(SysUser)session.getAttribute("user");
		 if(user!=null) {
			 role.setUpdateBy(user.getUserName());
		 }
		 return service.create(role);
	 }
	 //修改
	 @PostMapping("/update")
	 public Integer update(com.accp.domain.SysRole role,HttpSession session) {
		 SysUser user=(SysUser)session.getAttribute("user");
		 if(user!=null) {
			 role.setUpdateBy(user.getUserName());
		 }
		 return service.update(role);
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
			public ResponseEntity<byte []> exportExcel(String roleName, String roleKey
					 ,String status
					 ,String createtimenum1,String createtimenum2){
				try {
					List<SysRole> list =service.wherefind(roleName, roleKey, status, createtimenum1, createtimenum2);
					//创建excel
					XSSFWorkbook xss = new XSSFWorkbook();
					//创建sheet页
					Sheet sheet = xss.createSheet();
					Row titleRow = sheet.createRow(0);
					Cell cellDictCode = titleRow.createCell(0);
					cellDictCode.setCellValue("角色ID");
					Cell cellDictSort = titleRow.createCell(1);
					cellDictSort.setCellValue("角色名称");
					Cell cellDictLabel = titleRow.createCell(2);
					cellDictLabel.setCellValue("角色权限字符串");
					Cell cellDictValue = titleRow.createCell(3);
					cellDictValue.setCellValue("显示顺序");
					Cell cellDictType = titleRow.createCell(4);
					cellDictType.setCellValue("数据范围（1：全部数据权限 2：自定数据权限）");
					Cell cellCssClass = titleRow.createCell(5);
					cellCssClass.setCellValue("角色状态（0正常 1停用）");
					Cell cellIsDefault = titleRow.createCell(6);
					cellIsDefault.setCellValue("删除标志（0代表存在 2代表删除）");
					Cell cellStatus = titleRow.createCell(7);
					cellStatus.setCellValue("创建者");
					Cell cell8 = titleRow.createCell(8);
					cell8.setCellValue("创建时间");
					Cell cell9 = titleRow.createCell(9);
					cell9.setCellValue("更新者");
					Cell cell10 = titleRow.createCell(10);
					cell10.setCellValue("更新时间");
					Cell cell11 = titleRow.createCell(11);
					cell11.setCellValue("备注");
					for(int i=0;i<list.size();i++) {
						/*Row row = sheet.createRow(i+1);
						Cell dictCode = row.createCell(0);
						dictCode.setCellValue(list.get(i).getRoleId());
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
						status1.setCellValue(list.get(i).getSex());*/
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

			 //查询所有项目
			 @GetMapping("/findpro")
			 @ResponseBody
			 public List<SysProject> findpro(){
				 return service.findpro();
			 }
}
