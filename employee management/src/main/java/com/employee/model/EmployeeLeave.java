package com.employee.model;

public class EmployeeLeave {
	
	private int employeeId;
	private String fromDate;
	private String toDate;
	private String textArea;
	
	public EmployeeLeave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeLeave(int employeeId, String fromDate, String toDate, String textArea) {
		super();
		this.employeeId = employeeId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.textArea = textArea;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getTextArea() {
		return textArea;
	}

	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}

	@Override
	public String toString() {
		return "EmployeeLeave [employeeId=" + employeeId + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", textArea=" + textArea + "]";
	}

}
