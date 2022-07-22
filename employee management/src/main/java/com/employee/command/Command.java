package com.employee.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface Command {

//	String excute(HttpServletRequest request,HttpServletResponse response);
	Map<String, Object> execute(Map<String, String> map, HttpServletRequest request);

}
