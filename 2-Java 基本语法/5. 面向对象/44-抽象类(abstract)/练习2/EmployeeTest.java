package com.wndexx.exer1;

public class EmployeeTest {
	public static void main(String[] args) {

		// ε€ζ
		Employee manager = new Manager("εΊε", 1001, 5000, 50000);
		manager.work();
		
		Employee employee = new CommonEmployee();
		employee.work();
	}
}
