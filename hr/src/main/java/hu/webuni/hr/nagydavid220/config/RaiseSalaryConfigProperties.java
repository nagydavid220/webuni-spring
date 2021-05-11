package hu.webuni.hr.nagydavid220.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "hr")
@Component
public class RaiseSalaryConfigProperties {

	private Employee employee = new Employee();
	
	public static class Smart {
		private int workedmonth2;
		private int workedmonth5;
		private int workedmonth10;
		private int percent2;
		private int percent5;
		private int percent10;
		
		public int getWorkedmonth2() {
			return workedmonth2;
		}
		public void setWorkedmonth2(int workedmonth2) {
			this.workedmonth2 = workedmonth2;
		}
		public int getWorkedmonth5() {
			return workedmonth5;
		}
		public void setWorkedmonth5(int workedmonth5) {
			this.workedmonth5 = workedmonth5;
		}
		public int getWorkedmonth10() {
			return workedmonth10;
		}
		public void setWorkedmonth10(int workedmonth10) {
			this.workedmonth10 = workedmonth10;
		}
		public int getPercent2() {
			return percent2;
		}
		public void setPercent2(int percent2) {
			this.percent2 = percent2;
		}
		public int getPercent5() {
			return percent5;
		}
		public void setPercent5(int percent5) {
			this.percent5 = percent5;
		}
		public int getPercent10() {
			return percent10;
		}
		public void setPercent10(int percent10) {
			this.percent10 = percent10;
		}
		
	}
	
	public static class Employee {
		
		private Smart smart = new Smart();

		public Smart getSmart() {
			return smart;
		}

		public void setSmart(Smart smart) {
			this.smart = smart;
		}
	}	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
