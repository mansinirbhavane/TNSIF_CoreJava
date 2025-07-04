package com.TNSIF.daysix.staticmethod;

public class Myclass {
	
	private  int section;
	private static int srNo;
	
	//static block
	static 
	{System.out.println("Within static block");
	srNo=1000;
	
}
	//default constructor
	public Myclass() {
		System.out.println("Within default constructor");
		srNo=1000;
	}
	
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
		
	}
	
	static void display() {
		System.out.println("Serial No: "+ srNo);
	}
}
