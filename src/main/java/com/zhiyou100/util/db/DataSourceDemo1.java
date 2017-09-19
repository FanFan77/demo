package com.zhiyou100.util.db;




import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSourceDemo1 {

	public static void main(String[] args) throws SQLException {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("org.gjt.mm.mysql.Driver");
		dmds.setUrl("jdbc:mmysql://localhost:3306/springdb");
		dmds.setUsername("root");
		dmds.setPassword("fanfan277");
		
		DataSource source=dmds;
		Logger.getLogger(DataSourceDemo1.class).info(source.getConnection());
	}

}
