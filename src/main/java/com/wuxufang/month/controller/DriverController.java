package com.wuxufang.month.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.wuxufang.month.pojo.Driver;
import com.wuxufang.month.pojo.Types;
import com.wuxufang.month.service.DriverService;

@Controller
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	//查看列表
	@RequestMapping("list")
	public String select(Driver drivers,Model model,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "5")Integer pageSize) {
		PageInfo<Driver> info = driverService.select(drivers, page, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("drivers", drivers);
		return "list";
	}

	//类型查询
	@ResponseBody
	@RequestMapping("getTypesList.do")
	public Types getTypesList() {
		return driverService.getTypesList();
	}
	
	//添加
	@ResponseBody
	@RequestMapping("add")
	public boolean insert(@RequestParam("file") MultipartFile file,Driver drivers,HttpSession session) {
		if(!file.isEmpty()) {
			String upload = "d:/pic/";
			String filename = file.getOriginalFilename();
			String newFilename = UUID.randomUUID()+filename.substring(filename.lastIndexOf("."));
			File f = new File(upload, newFilename);
			try {
				file.transferTo(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
			drivers.setMovie(newFilename);
		}
		drivers.setSid(drivers.getSid());
		drivers.setTitle(drivers.getTitle());
		drivers.setCdate(drivers.getCdate());
		drivers.setTid(drivers.getTid());
		
		return driverService.insert(drivers);
	}
}
