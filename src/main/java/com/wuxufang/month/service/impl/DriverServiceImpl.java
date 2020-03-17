package com.wuxufang.month.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuxufang.month.dao.DriverDao;
import com.wuxufang.month.pojo.Driver;
import com.wuxufang.month.pojo.Types;
import com.wuxufang.month.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverDao driverDao;

	//查看列表
	@Override
	public PageInfo<Driver> select(Driver drivers, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Driver> list = driverDao.select(drivers);
		PageInfo<Driver> info = new PageInfo<Driver>(list);
		return info;
	}

	//类型查询
	@Override
	public Types getTypesList() {
		return driverDao.getTypesList();
	}

	//添加
	@Override
	public boolean insert(Driver drivers) {
		return driverDao.insert(drivers) > 0;
	}

}
