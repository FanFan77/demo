package com.zhiyou100.springdb.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou100.util.db.DataSourceDemo1;

public class TestDataSourceDemo02 {
	private static ApplicationContext myContext = null;
	static {
		myContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	public static void main(String[] args) {
		Logger.getLogger(DataSourceDemo1.class).info(myContext.getBean("dataSource"));
	}

}
