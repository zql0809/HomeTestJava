package com.zglv.travel.application.config.UtilsConfig;


public class Redis {
	private String host;
	private Integer port;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "Redis [host=" + host + ", port=" + port + "]";
	}
	
}
