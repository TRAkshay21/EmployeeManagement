package com.employee.factory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;



import com.employee.DbConnection.DbConnectionPool;
import com.employee.command.Command;
import com.employee.model.Holder;

public class CommandFactory  
{
	Connection con = null;
	public CommandFactory() {
		try {
			con = DbConnectionPool.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static Map<String, Holder> map2 = new HashMap<>();
	
 static {
	// TODO Auto-generated method stub
	 Properties properties = null;
	 InputStream inputStream = null;
	ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
	inputStream = classLoader.getResourceAsStream("utils/command.properties");
	properties = new Properties();
	try { 
		properties.load(inputStream);	
		inputStream.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	Iterator mappingIter = properties.keySet().iterator();
	while(mappingIter.hasNext()) {
		String key = (String)mappingIter.next();
//		System.out.println("%%%%%%%%%% Key"+key);
		String value = properties.getProperty(key);
		System.out.println("$$$$$$$$ VAlue"+value);
		//String[] uriSplitArr = value.split("/");
		//String reqPath = uriSplitArr[uriSplitArr.length-1];
		Holder mapHolder = new Holder();
		String[] mappedValueArr=value.split("::");
		mapHolder.setClassName(mappedValueArr[0]);
		mapHolder.setUrl(key);
//		System.out.println("before if"+mappedValueArr.length);
		
		if(mappedValueArr.length>1) {
		String[] returnUrlArr=	mappedValueArr[1].split(",");
//		System.out.println("1"+"if"+mappedValueArr[1]);
		for (String oneUrlMapping: returnUrlArr) {
			String[] parts=oneUrlMapping.split(":");
//			System.out.println("2"+"for");
//			System.out.println("3"+"for"+parts[0]+"=="+parts[1]);
			mapHolder.getPageMappings().setProperty(parts[0], parts[1]);
		//	 Properties p=null;
		//	p.setProperty(parts[0], parts[1]);
		//	mapHolder.setPageMappings(p);
			//if(parts.length>2) {
			//	mapHolder.getPageMappings().setProperty(parts[0], parts[1]);
			//}
		}
		//mapHolder.setClassName(value);
		//mapHolder.setUrl(key);
		System.out.println("Key $$"+key);
		System.out.println("value $$$"+value);
					
	}
		map2.put(key, mapHolder);
	//String uriPath = request.getRequestURI();
//	System.out.println("@@@@@@@@@"+uriPath);
	//return map2;
	}
//	System.out.println(map2);
}
	public static Command createCommand(String request) {
		//String holder = request;
		Holder holder=map2.get(request);
		System.out.println(request+"%%%%%1%%%%%"+map2);
		Command command = null;
		if(holder==null) {	
			return null;
		}
		else {
			
			String className=holder.getClassName();
			try {
				Class clz=Class.forName(className);
				try {
					command=(Command)	clz.newInstance();
				} catch (InstantiationException | IllegalAccessException e) {				
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {				
				e.printStackTrace();
			}
		}
		return command;
	}
	
}

