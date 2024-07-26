package com.bhumika.bankSystem;

public class AmountDeposit extends AccountDetails{
	double amount;
	
	void deposit()
	{
		System.out.println("Enter amount to deposit");
		amount=sc.nextDouble();
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Current balance is: "+balance);
		}
		else
		{
			System.err.println("Invalid Amount");
		}
	}

}
