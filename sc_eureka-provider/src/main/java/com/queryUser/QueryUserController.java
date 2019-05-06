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
		List<QueryUser> findUser = userService.findUser();
		String temp="";
		for (QueryUser queryUser : findUser) {
			temp+="<h1>name:"+queryUser.getUname()+"  &nbsp;&nbsp;&nbsp;&nbsp;密码："+queryUser.getUpwd()+"<h1>";
		}
		return  temp+"<a href=http://localhost:7902/index>返回首页</a>";
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public String show(QueryUser user) {
		
		userService.addUser(user);
		
		return "<h1>添加成功"+user+"<h1><a href='http://localhost:7902/hello'>点击查询全部<a>";
		
	}
	
	@RequestMapping("/delUser")
	@ResponseBody
	public String delUser(String uname) {
		
		int delUser = userService.delUser(uname);
		String temp="";
		if(delUser==1) {
			temp="删除成功";
		}else {
			temp="删除失败";
		}
		
		return "<h1>"+temp+"<h1><a href='http://localhost:7902/hello'>点击查询全部<a>";
		
	}

}
