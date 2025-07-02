package com.TNSIF.daythree.scanner;

public class Person {
 private String name;
 private int income;
 private String Gender;
 private int age;
 private long MobileNumber;
 private int tax;
 


//Used GetSet method for the process
//RC+Source+GetSet
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public int getIncome() {
	return income;
 }
 public void setIncome(int income) {
	this.income = income;
 }
 public String getGender() {
	return Gender;
 }
 public void setGender(String gender) {
	Gender = gender;
 }
 public int getAge() {
	return age;
 }
 public void setAge(int age) {
	this.age = age;
 }
 public long getMobileNumber() {
	return MobileNumber;
 }
 public void setMobileNumber(long mobileNumber) {
	MobileNumber = mobileNumber;
 }
 public int getTax() {
	return tax;
 }
 public void setTax(int tax) {
	this.tax = tax;
 }
 
//Use toString
 @Override
 public String toString() {
	return "Person [name=" + name + ", income=" + income + ", Gender=" + Gender + ", age=" + age + ", MobileNumber="
			+ MobileNumber + ", tax=" + tax + "]";
 }
 
}
 

 
