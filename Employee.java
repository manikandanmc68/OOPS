package com.Aggregation;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private Address employeeAddress;
	
	public Employee(int employeeId, String employeeName, Address employeeAddress) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	
	public void printEmployeeDetails() {
		
		System.out.println("Employee Id :" +employeeId);
		System.out.println("Employee Name :" +employeeName);
		System.out.println("Address Line :" +employeeAddress.getAddressLine());
		System.out.println("City :" +employeeAddress.getCity());
		System.out.println("Zip Code :" +employeeAddress.getZipcode());
		
	}

}
