package com.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.bean.UserDetails;

public interface SaveDao 
{
	int register(UserDetails userDetails, HttpServletRequest req);
	boolean checkUser(String emailId, String mobileNo);
	List<UserDetails> login(String email, String password);
	List<UserDetails> forgetPassword(String emailId);
	
	
}
