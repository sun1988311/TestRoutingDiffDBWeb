package com.sun.diff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.diff.dao.api.ICrtUserDao;
import com.sun.diff.form.CrtUser;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private ICrtUserDao crtUserDao;
	
	@RequestMapping(value = "/{userId}")
	public CrtUser selectUserByPrimaryKey(@PathVariable("userId") Long userId)
	{
		CrtUser crtUser = this.crtUserDao.selectByPrimaryKey(userId);
		return crtUser;
	}
	
	@RequestMapping(value = "/{loginName}/{password}")
	public String isExistCrtUser(@PathVariable("loginName") String loginName,@PathVariable("password") String pwd)
	{
		System.out.println(loginName);
		System.out.println(pwd);
		CrtUser record = new CrtUser();
		record.setUserLoginname(loginName);
		int crtUserCount = this.crtUserDao.isExistCrtUser(record);
		return "";
	}
	
}
