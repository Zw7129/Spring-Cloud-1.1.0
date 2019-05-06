package com.vo;

import java.io.Serializable;

public class QueryUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//名称
	private  String uname;
	//密码
	private  String upwd;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	@Override
	public String toString() {
		return "QueryUser [uname=" + uname + ", upwd=" + upwd + "]";
	}
}
