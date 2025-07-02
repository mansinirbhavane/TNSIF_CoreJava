package com.TNSIF.dayfour.firstpackage;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Base b1= new Base();
	b1.methodDefault();
	b1.methodProtected();
	b1.methodPublic();
	
	b1.varDefault =11;
	b1.methodDefault();
	
	b1.varProtected=123;
	b1.methodProtected();
	}
}
