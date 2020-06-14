package FirstJava;

public class Employee {

	String name ; 
	Address address;
	
	public Employee(String name, Address address){
		this.name = name;
		this.address = address;
	}
	
	void display1(){
		System.out.println(name); // Employee  Class
		System.out.println(address.country+ "  "+address.state); // Address Class
	}

}
