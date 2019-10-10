package com.zglv.travel.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zglv.travel.application.config.UtilsConfig.RedisClusterConfig;
import com.zglv.travel.application.config.entity.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	RedisClusterConfig config;
	@Test
	public void contextLoads() {
		System.out.println(config);
	}

}

