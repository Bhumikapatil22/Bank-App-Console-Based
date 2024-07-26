package com.bhumika.bankSystem;

import java.util.*;
public class AccountDetails {
	double accNo,balance;
	String name;
	Scanner sc=new Scanner(System.in);
	void addUser()
	{
		System.out.println("---Add User---");
		System.out.println("Enter your Name:");
		name=sc.nextLine();
		
		System.out.println("Enter you Account number:");
		accNo=sc.nextDouble();
		
		System.out.println("Enter you Balance:");
		balance=sc.nextDouble();
	}
	void viewUser()
	{
		System.out.println("---View Details---");
		System.out.println("Name is:"+name);
		System.out.println("Account number is:"+accNo);
		System.out.println("Balance is:"+balance);
	}
	void checkBalance()
	{
		System.out.println("Balance is:" + balance);
	}
}
