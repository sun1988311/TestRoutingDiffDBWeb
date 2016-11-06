package com.sun.diff.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.diff.dao.api.ICrtUserDao;
import com.sun.diff.dao.api.ISay;
import com.sun.diff.dao.common.DataSourceTypeManager;
import com.sun.diff.dao.common.DataSources;
import com.sun.diff.dao.impl.CrtUserDaoImpl;
import com.sun.diff.dao.impl.SayImpl;
import com.sun.diff.form.CrtUser;

public class MainRunner {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/dbConfig/ApplicationContext.xml");
		
//		ICrtUserDao crtUserDao = (CrtUserDaoImpl)ac.getBean("crtUserDaoImpl");
		
		ISay say =(SayImpl)ac.getBean("sayImpl");
		
		say.sayMessage("hello");
		
//		DataSourceTypeManager.set(DataSources.MYSQL);
		
//		CrtUser crtUser = crtUserDao.selectByPrimaryKey(1000000082L);
//		CrtUser crtUser = crtUserDao.selectByPrimaryKey(1L);
//		System.err.println(crtUser.getUserLoginname());
		
//		CrtUser crtUserOracle = new CrtUser();
//		String userName = "testUserOracle1@126.com";
//		crtUserOracle.setCreateUser(userName);
//		crtUserOracle.setUserLoginname(userName);
//		crtUserOracle.setUserPassword("sw1234567");
//		crtUserOracle.setUpdateUser(userName);
//		crtUserOracle.setCreateDate(new Date());
//		crtUserOracle.setUpdateDate(new Date());
//		int result = crtUserDao.insert(crtUserOracle);
//		System.err.println(result);
		

	}

}
