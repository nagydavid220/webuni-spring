package hu.webuni.hr.nagydavid220.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.nagydavid220.service.EmployeeService;
import hu.webuni.hr.nagydavid220.service.SmartEmployeeService;

@Configuration
@Profile("smart")
public class SmartRaiseSalaryPercentConfiguration {

	@Bean
	public EmployeeService employeeService() {
		return new SmartEmployeeService();
	}
}
