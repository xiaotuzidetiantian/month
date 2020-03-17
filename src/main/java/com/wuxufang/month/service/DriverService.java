package com.wuxufang.month.service;

import com.github.pagehelper.PageInfo;
import com.wuxufang.month.pojo.Driver;
import com.wuxufang.month.pojo.Types;

public interface DriverService {

	//查看列表
	PageInfo<Driver> select(Driver drivers,Integer page,Integer pageSize);
	
	//类型查询
	Types getTypesList();
	
	//添加
	boolean insert(Driver drivers);
}
