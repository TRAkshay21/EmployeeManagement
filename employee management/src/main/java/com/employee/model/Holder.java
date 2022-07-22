package com.employee.model;

import java.util.Properties;

public class Holder {
 
	private String className;
	private Properties pageMappings= new Properties();
	private String url;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Properties getPageMappings() {
		return pageMappings;
	}
	public void setPageMappings(Properties pageMappings) {
		this.pageMappings = pageMappings;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
