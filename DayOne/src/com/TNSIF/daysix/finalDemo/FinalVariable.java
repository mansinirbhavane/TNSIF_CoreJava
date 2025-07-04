package com.TNSIF.daysix.finalDemo;

public class FinalVariable {
	final int x=100;
	//Declared  a static blank final variable
	
	final static int y;
	final static int z=10;
	void change()
	{
//		x=30;
	//	z=50;
	}
@Override
	public String toString() {
		return "FinalVariable [x=" + x + ",y="+ y + "]";
		
	}

	 static
	 {
		 y=20;
			//z=80;  once initialized can't be reassigned
			System.out.println("value of Y : "+ y);
		}
		
		
		
	}