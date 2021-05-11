package hu.webuni.hr.nagydavid220;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.webuni.hr.nagydavid220.model.Employee;
import hu.webuni.hr.nagydavid220.service.SalaryService;

@SpringBootApplication
public class HrApplication implements CommandLineRunner {
	
	@Autowired
	SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//First employee
		LocalDateTime employee1StartDate = LocalDateTime.of(2009, Month.JULY, 29, 19, 30, 40);
		Employee employee1 = new Employee(10001, "Elek", "Manager", 3500, employee1StartDate);
		
		//Second employee
		LocalDateTime employee2StartDate = LocalDateTime.of(2016, Month.MARCH, 10, 07, 15, 22);
		Employee employee2 = new Employee(10002, "Petra", "CTO", 4200, employee2StartDate);
		
		//Third employee
		LocalDateTime employee3StartDate = LocalDateTime.of(2020, Month.MAY, 02, 13, 52, 37);
		Employee employee3 = new Employee(10003, "Zohan", "Driver", 2800, employee3StartDate);
		
		//Fourth employee
		LocalDateTime employee4StartDate = LocalDateTime.of(2018, Month.NOVEMBER, 07, 8, 00, 53);
		Employee employee4 = new Employee(10004, "Melissa", "SoftwareDeveloper", 3750, employee4StartDate);
		
		System.out.println(employee1.getEmployeeName() + " basic salary: " + employee1.getEmployeeSalary() + " USD and the new salary: " + salaryService.getRaisedSalary(employee1));
		System.out.println(employee2.getEmployeeName() + " basic salary: " + employee2.getEmployeeSalary() + " USD and the new salary: " + salaryService.getRaisedSalary(employee2));
		System.out.println(employee3.getEmployeeName() + " basic salary: " + employee3.getEmployeeSalary() + " USD and the new salary: " + salaryService.getRaisedSalary(employee3));
		System.out.println(employee4.getEmployeeName() + " basic salary: " + employee4.getEmployeeSalary() + " USD and the new salary: " + salaryService.getRaisedSalary(employee4));	
	}
	
}
