package com.employee.controler;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.command.Command;
import com.employee.command.Constant;
import com.employee.factory.CommandFactory;
import com.employee.model.Holder;

//@WebServlet("*.action")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	Properties properties = null;
    
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	@Override
	public void init() throws ServletException {
		super.init();
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(); 
		//System.out.println(session+"session-----------=================9000000000000");
		String operation = request.getParameter("action");
		
		if(operation!=null&&operation.equals("logout")) {
			session.invalidate();
			System.out.println("Sesssion Invalidated");
		}
		else if(session==null) {
			response.sendRedirect("error.action");
		}
		
		
		String uripath = request.getRequestURI();
		//String uripath = request.getServletPath();
		System.out.println("&&&&&&&1&&&&"+uripath);
		String [] urisplit = uripath.split("/");
		String reqpath = urisplit[urisplit.length-1];
//		System.out.println("$$$$$2$$$$"+uripath);
		Command command = (Command) CommandFactory.createCommand(reqpath);
//		String[] urisplit = uripath.split("/");
		if(command!=null) {
			Map<String, String> map = new HashMap<>();
			String pramaValue = null;
			Enumeration<String> pramaNames = request.getParameterNames();
			while (pramaNames.hasMoreElements()) {
				String pramaName = pramaNames.nextElement();
				pramaValue = request.getParameter(pramaName);
				map.put(pramaName, pramaValue);
			}
			Map<String,Object> map2 = command.execute(map,request);
//			System.out.println("$$$$$3$$$$$$"+map2);
			String resString = (String) map2.get(Constant.uriPath);
			Holder hol = CommandFactory.map2.get(reqpath);
			Properties prop = hol.getPageMappings();
			String respath =(String)prop.getProperty(resString);
			request.setAttribute("list", map2.get(Constant.list));
			if(respath==null) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("error.action");
				dispatcher.forward(request, response);
			}
			else{
				RequestDispatcher rd = request.getRequestDispatcher(respath);
				rd.forward(request, response);
			}
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}    
