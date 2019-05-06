package com.queryUser;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.QueryUserService;
import com.vo.QueryUser;


@RestController
public class QueryUserController {
	@Resource
	private QueryUserService userService;
	
	@RequestMapping("/findUser")
	public String sayhello(){
		System.out.println("111111111111111111111111111111111111111111111111111");
		List<QueryUser> findUser = userService.findUser();
		String temp="";
		for (QueryUser queryUser : findUser) {
			temp+="<h1>"+queryUser+"<h1>";
		}
		return  temp;
	}
	
	@RequestMapping("/ll")
	@ResponseBody
	public String show() {
		return "123";
		
	}

}
