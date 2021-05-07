package hu.webuni.hr.nagydavid220;

import java.time.LocalDateTime;

public class Employee {

	public Employee(long employeeId, String employeeName, String employeePosition, int employeeSalary, LocalDateTime employeeStartDate) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.employeeSalary = employeeSalary;
		this.employeeStartDate = employeeStartDate;
	}
	
	private long employeeId;
	private String employeeName;
	private String employeePosition;
	private int employeeSalary;
	private LocalDateTime employeeStartDate;	
	
	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeePosition() {
		return employeePosition;
	}
	
	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}
	
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public LocalDateTime getEmployeeStartDate() {
		return employeeStartDate;
	}
	
	public void setEmployeeStartDate(LocalDateTime employeeStartDate) {
		this.employeeStartDate = employeeStartDate;
	}

}
