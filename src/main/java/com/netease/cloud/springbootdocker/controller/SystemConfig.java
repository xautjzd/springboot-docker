package com.netease.cloud.springbootdocker.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by jiangzhengdong on 11/01/2018.
 */
@Configuration
@ConfigurationProperties(prefix = "")
@PropertySource("classpath:system.properties")
public class SystemConfig {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
