package com.wuxufang.month.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.wuxufang.month.pojo.Driver;
import com.wuxufang.month.service.DriverService;

@Component
@EnableKafka
public class DriverConsumer implements MessageListener<String, String> {

	@Autowired
	private DriverService driverService;
	
	@Override
	@KafkaListener(topics = "drivertopic")
	public void onMessage(ConsumerRecord<String, String> consumerRecord) {
		String driverstring = consumerRecord.value();
		Driver drivers = JSON.parseObject("driverstring", Driver.class);
		driverService.insert(drivers);
		System.out.println(drivers);
	}

	
}
