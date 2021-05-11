package hu.webuni.hr.nagydavid220.service;

import org.springframework.stereotype.Service;

import hu.webuni.hr.nagydavid220.model.Employee;

@Service
public class SalaryService {
	
	private EmployeeService employeeService;
	
	private SalaryService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public int getRaisedSalary(Employee employee) {
		int raisedSalary = (int)(employee.getEmployeeSalary() * (1.0 + (employeeService.getPayRaisePercent(employee) / 100.0)));
		return raisedSalary;	
	}

}
