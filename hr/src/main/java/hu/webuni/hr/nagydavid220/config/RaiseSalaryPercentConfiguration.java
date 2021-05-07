package hu.webuni.hr.nagydavid220.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.nagydavid220.service.DefaultEmployeeService;
import hu.webuni.hr.nagydavid220.service.EmployeeService;

@Configuration
@Profile("!smart")
public class RaiseSalaryPercentConfiguration {

	@Bean
	public EmployeeService employeeService() {
		return new DefaultEmployeeService();
	}
}
