package com.TNSIF.daytwo.Jump;

public class Switch {

	public static void main(String[] args) {
		int userInput=1;
		switch(userInput)
		{
		case 1: System.out.println("Current Recharg Details");
		break;
		
		case 2: System.out.println("Current Recharg Expiry");
		break;
		
		case 3: System.out.println("New offers");
		break;
		
		case 4: System.out.println("Connect with our customer care");
		break;
		
		default:
			System.out.println(userInput +"Its not the valid input given by you!");
		
		
		}

	}

}
