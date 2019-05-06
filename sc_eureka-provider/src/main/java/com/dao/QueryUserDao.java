package com.dao;

import java.util.List;

import com.vo.QueryUser;

public interface QueryUserDao {
	
	public List<QueryUser> findUser();
	
	public int addUser(QueryUser user);
	
	public int delUser(String uname);

}
