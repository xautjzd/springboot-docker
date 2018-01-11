package com.netease.cloud.springbootdocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Crated by jiangzhengdong on 09/01/2018.
 */
@RestController
public class HelloController {

	@Autowired
	SystemConfig systemConfig;

	@Autowired
	Environment environment;

	@RequestMapping(value = "/hello")
	public String hello() {
		return "Hello, Worlodssss";
	}

	@RequestMapping(value = "/name")
	public String name() {
		return systemConfig.getName();
	}
}
