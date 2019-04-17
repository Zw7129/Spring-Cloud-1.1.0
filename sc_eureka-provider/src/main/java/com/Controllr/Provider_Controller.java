package com.Controllr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Provider_Controller {
	@RequestMapping("/hello")
	public String sayhello(){
		String temp="<h1>你好啊！！</h1>";
		
		return temp;
	}

}
