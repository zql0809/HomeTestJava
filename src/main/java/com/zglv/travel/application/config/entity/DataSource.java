package com.zglv.travel.application.config.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dataSource.properties")
@ConfigurationProperties(prefix="datasource")
public class DataSource {
	//@Value("${dataSource.name}")
	private String name;
	//@Value("${dataSource.url}")
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "DataSource [name=" + name + ", url=" + url + "]";
	}
	
	
}
