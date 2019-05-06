package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.QueryUserDao;
import com.vo.QueryUser;

@Service
public class QueryUserService {

	@Resource
	QueryUserDao userDao;

	public List<QueryUser> findUser() {
		return userDao.findUser();
	}

}
