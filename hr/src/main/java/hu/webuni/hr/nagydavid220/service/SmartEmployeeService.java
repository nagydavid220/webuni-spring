package hu.webuni.hr.nagydavid220.service;

import org.springframework.stereotype.Service;

import hu.webuni.hr.nagydavid220.Employee;

@Service
public class SmartEmployeeService implements EmployeeService{

	@Override
	public int getPayRaisePercent(Employee employee) {
		return 10;
	}
}
