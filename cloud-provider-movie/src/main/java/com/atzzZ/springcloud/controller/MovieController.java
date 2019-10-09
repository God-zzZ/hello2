package com.atzzZ.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atzzZ.springcloud.bean.Movie;
import com.atzzZ.springcloud.service.MovieService;

// 由于当前项目一会由用户服务远程调用，使用springcloud，底层使用RestFul风格调用，那么背远程调用的controller方法必须采用HTTP+JSON的方式返回数据

@RestController //相当于controller中所有的方法上都加了@ResponseBody注解
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@Value("${server.port}")
	Integer port;

	//@ResponseBody //自动将数据对象转成Json字符串返回
	@GetMapping("/getNewMovie")
	public Movie getNewMovie() {
		System.out.println("电影服务："+port+"  被访问了");
		return movieService.getNewMovie();
	}
	public void test1(){}
	public void test2(){}
	public void test3(){}
	
}























