package com.wuxufang.month.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.wuxufang.month.pojo.Driver;
import com.wuxufang.month.service.DriverService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class DriverServiceImplTest {

	@Autowired
	private DriverService driverService;
	@SuppressWarnings("unused")
	@Autowired
	private KafkaTemplate kafkaTemplate;
	
	@Test
	public void tests() {
		Driver driver = new Driver();
		String driverStr = JSON.toJSONString(driver);
		kafkaTemplate.send("drivertopic",driverStr);
	}
}
