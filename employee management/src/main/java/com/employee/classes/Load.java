package com.employee.classes;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.employee.command.Command;
import com.employee.command.Constant;

public class Load implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {
		Map<String, Object> map2 = new HashMap<String, Object>();

		map2.put(Constant.uriPath, "success");
		return map2;
	}
}
