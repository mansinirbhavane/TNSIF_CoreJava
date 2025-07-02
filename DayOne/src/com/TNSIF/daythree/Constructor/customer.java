package com.TNSIF.daythree.Constructor;

public class customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	
	
	//default constructor
	
	
	public customer () 
	
	{
		
		System.out.println("this is default constructor");
		
	}
	
	//para constructor
	
	public customer (String customername,int customerid,String customercity) {
		
		System.out.println("this is para constructor");
		this.customerName=customerName;
		this.customerId=customerId;
		this.customerCity=customerCity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	
	

	

}