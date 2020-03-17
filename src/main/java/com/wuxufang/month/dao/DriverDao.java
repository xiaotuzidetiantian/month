package com.wuxufang.month.dao;

import java.util.List;

import com.wuxufang.month.pojo.Driver;
import com.wuxufang.month.pojo.Types;

public interface DriverDao {

	//查看列表
	List<Driver> select(Driver drivers);
	
	//类型查询
	Types getTypesList();
	
	//添加
	int insert(Driver drivers);
	
}
