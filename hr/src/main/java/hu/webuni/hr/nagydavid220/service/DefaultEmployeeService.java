package hu.webuni.hr.nagydavid220.service;

import org.springframework.stereotype.Service;

import hu.webuni.hr.nagydavid220.model.Employee;

@Service
public class DefaultEmployeeService implements EmployeeService{

	@Override
	public int getPayRaisePercent(Employee employee) {
		return 5;
	}
}
