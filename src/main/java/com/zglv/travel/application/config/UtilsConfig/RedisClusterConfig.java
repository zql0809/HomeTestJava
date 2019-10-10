package com.zglv.travel.application.config.UtilsConfig;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="redis")
public class RedisClusterConfig {
	private Integer port;
	private List<String> hosts;
	private List<Redis> rList;
	
	
	public List<Redis> getrList() {
		return rList;
	}
	public void setrList(List<Redis> rList) {
		this.rList = rList;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public List<String> getHosts() {
		return hosts;
	}
	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}
	@Override
	public String toString() {
		return "RedisClusterConfig [port=" + port + ", hosts=" + hosts + ", rList=" + rList + "]";
	}
	
	
}
