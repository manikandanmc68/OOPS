package com.Aggregation;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Address address=new Address();
	address.setAddressLine("John Selvaraj Nagar");
	address.setCity("Kumbakonam");
	address.setZipcode(612001);
	
		Employee employee=new Employee(12328,"Manik",address);
		employee.printEmployeeDetails();
	}

}
