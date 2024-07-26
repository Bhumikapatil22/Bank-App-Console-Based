package com.bhumika.bankSystem;

public class AmountWithdraw extends  AmountDeposit {

	void withDraw()
	{
		double amount;
		System.out.println("Enter ammount to withdraw");
		amount=sc.nextDouble();
		if((balance-amount)>=0 && amount>0)
		{
			balance-=amount;
			System.out.println("Current balance is: "+balance);
		}
		else
		{
			System.err.println("Low Balance OR Invalid Amount");
		}
		
	}
}
