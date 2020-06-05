package com.pro;
import java.text.DecimalFormat;
import java.util.*;
public class Account 
{
Scanner input=new Scanner(System.in);
DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
private int customerNumber;
private int pinNumber;
private double checkingBalance=0;
private double savingBalance=0;

public int setCustomerNumber(int customerNumber) 
{
this.customerNumber=customerNumber;
return customerNumber;
}

public int getCustomerNumber() 
{
	return customerNumber;
}

public int setPinNumber(int pinNumber) 
{
this.pinNumber=pinNumber;	
return pinNumber;
}

public int getPinNumber() 
{
return pinNumber;
}

public double getCheckingBalance() 
{
	
	return checkingBalance;
}

public double getSavingBalance() 
{
	
	return savingBalance;
}

public double checkingWithdraw(double amount) 
{
	checkingBalance=(checkingBalance-amount);
	return checkingBalance;
	}

public double savingWithdraw(double amount) 
{
	savingBalance=(savingBalance-amount);
	return savingBalance;
	}

public double checkingDeposit(double amount) 
{
	checkingBalance=(checkingBalance+amount);
	return checkingBalance;
	}

public double savingDeposit(double amount) 
{
	savingBalance=(savingBalance+amount);
	return savingBalance;
	}

public void getChekingWithdrawInput() 
{
	System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
	System.out.println("Amount you want to withdraw from Checking Account:");
	double amount=input.nextDouble();
	
	if((checkingBalance-amount)>=0) 
	{
		checkingWithdraw(amount);
		System.out.println("New checking Account balance: " + moneyFormat.format(checkingBalance));
	}else 
	{
		System.out.println("Balance cannot be negative." + "\n");
	}
}
	public void getsavingWithdrawInput() 
	{
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account:");
		double amount=input.nextDouble();
		
		if((savingBalance-amount)>=0) 
		{
			savingWithdraw(amount);
			System.out.println("New saving Account balance: " + moneyFormat.format(savingBalance));
		}else 
		{
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	public void getChekingDepositInput() 
	{
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit in Checking Account:");
		double amount=input.nextDouble();
		if((checkingBalance+amount)>=0) 
		{
			checkingDeposit(amount);
			System.out.println("New checking Account balance: " + moneyFormat.format(checkingBalance));
		}else 
		{
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
		public void getSavingDepositInput() 
		{
			System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
			System.out.println("Amount you want to deposit in Saving Account:");
			double amount=input.nextDouble();
			if((savingBalance+amount)>=0) 
			{
				savingDeposit(amount);
				System.out.println("New saving Account balance: " + moneyFormat.format(savingBalance));
			}else 
			{
				System.out.println("Balance cannot be negative." + "\n");
			}
			
	}

}
