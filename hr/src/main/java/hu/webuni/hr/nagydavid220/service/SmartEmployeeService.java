package hu.webuni.hr.nagydavid220.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import hu.webuni.hr.nagydavid220.config.RaiseSalaryConfigProperties;
import hu.webuni.hr.nagydavid220.model.Employee;

@Service
public class SmartEmployeeService implements EmployeeService{
	
//	@Value("${hr.employee.smart.workedmonth10}")
//	private int workedmonth10;
//	
//	@Value("${hr.employee.smart.workedmonth5}")
//	private int workedmonth5;
//	
//	@Value("${hr.employee.smart.workedmonth2}")
//	private int workedmonth2;
//	
//	@Value("${hr.employee.smart.percent10}")
//	private int percent10;
//	
//	@Value("${hr.employee.smart.percent5}")
//	private int percent5;
//	
//	@Value("${hr.employee.smart.percent2}")
//	private int percent2;
	
	private int payRaisePercent;
	
	@Autowired
	RaiseSalaryConfigProperties config;

	@Override
	public int getPayRaisePercent(Employee employee) {
		LocalDateTime today = LocalDateTime.now();
		long workedMonth = java.time.temporal.ChronoUnit.MONTHS.between(employee.getEmployeeStartDate(), today);
		
//		if(workedMonth >= workedmonth10) {
//			payRaisePercent = percent10;
//		} else if(workedMonth < workedmonth10 && workedMonth >= workedmonth5) {
//			payRaisePercent = percent5;
//		} else if(workedMonth < workedmonth5 && workedMonth >= workedmonth2) {
//			payRaisePercent = percent2;
//		} else {
//			payRaisePercent = 0;
//		}
		
		if(workedMonth >= config.getEmployee().getSmart().getWorkedmonth10()) {
			payRaisePercent = config.getEmployee().getSmart().getPercent10();
		} else if(workedMonth < config.getEmployee().getSmart().getWorkedmonth10() && workedMonth >= config.getEmployee().getSmart().getWorkedmonth5()) {
			payRaisePercent = config.getEmployee().getSmart().getPercent5();
		} else if(workedMonth < config.getEmployee().getSmart().getWorkedmonth5() && workedMonth >= config.getEmployee().getSmart().getWorkedmonth2()) {
			payRaisePercent = config.getEmployee().getSmart().getPercent2();
		} else {
			payRaisePercent = 0;
		}
		
		return payRaisePercent;
	}
}
