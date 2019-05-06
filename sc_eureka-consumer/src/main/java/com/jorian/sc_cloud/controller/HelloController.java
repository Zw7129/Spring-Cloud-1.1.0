package com.jorian.sc_cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloController {
	@Autowired
	private RestTemplate resttemplate;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		String url = "http://provider-user/findUser";

		// 返回值类型和我们的业务返回值一致
		return resttemplate.getForObject(url, String.class);

	}

	@RequestMapping("/index")
	public String index() {
		// 访问html需要创建templates目录
		return "index2";
	}
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(String uname,String upwd) {
		String url = "http://provider-user/addUser?uname="+uname+"&upwd="+upwd;
		// 返回值类型和我们的业务返回值一致
		return resttemplate.getForObject(url, String.class);

	}
	
	@RequestMapping("/delUser")
	@ResponseBody
	public String delUser(String uname) {
		String url = "http://provider-user/delUser?uname="+uname;
		// 返回值类型和我们的业务返回值一致
		return resttemplate.getForObject(url, String.class);

	}

}
