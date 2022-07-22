package com.employee.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import com.employee.command.Constant;

	public class DbConnectionPool {    
	    private static BasicDataSource ds = new BasicDataSource();    
	    static {
	        ds.setUrl(Constant.url);
	        ds.setUsername(Constant.userName);
	        ds.setPassword(Constant.password);
	        ds.setMinIdle(5);
	        ds.setMaxIdle(10);
	        ds.setMaxOpenPreparedStatements(100);
	    }
	    public static Connection getConnection() throws SQLException {
	        return ds.getConnection();
	    }   
	    public  static void closeConnection() throws SQLException {
	    	ds.close();
	    }
	    private DbConnectionPool(){ }
}
