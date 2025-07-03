package com.TNSIF.dayfive;

public class Executor {

	public static void main(String[] args) {
		Address address = new Address(" 405 Laxmi nagar", "Pune" , "Maharashtra", "India");
		Person p = new Person("Mansi" , address);
		p.displayInfo();
		System.out.println(p);
		

	}

}
