package com.wuxufang.month.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class Redis {

	@Autowired
	private RedisTemplate redisTemplate;
	
	@Test
	public void tests() {
		redisTemplate.opsForValue().set("month", "redis保存");
		Object object = redisTemplate.opsForValue().get("month");
		System.out.println(object);
	}
	
}
