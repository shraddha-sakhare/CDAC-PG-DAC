package Ass_5_mam;

import java.util.Scanner;

/*
Create a base class BankAccount with methods like deposit() and withdraw(). Derive a class 
SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount. 
Write a program that demonstrates the use of overridden methods and proper access modifiers & 
return the details.*/

class BankAccount {
	protected double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit		:" + amount + "  , new balance 	:" + balance);

	}

	public void withdraw(double amount ) {
		if(balance >= amount) {
			balance=balance - amount;
			System.out.println("Withdraw amount	:"+ amount + ", remaining balance 	:"+ balance );
		}	
		else {
				System.out.println("insufficent balace... please try again ");
			}
		
	}

	public double getBalance() {
		return balance;
	}

	
}

class SavingAccount extends BankAccount {
	private double withdrawlimit ;
	
	
	
	public SavingAccount(double balance, double withdrawlimit) {
		super(balance);
		this.withdrawlimit = withdrawlimit;
	}



	@Override
	public void withdraw(double amount ) {
		if(amount > withdrawlimit) {
			System.out.println("limit is over	:" +withdrawlimit ); 
	
		}else {
			System.out.println("withdraw amount is :" + amount );
		}

	}

}

public class Account {
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(25000, 5000);
		sa.deposit(1000);
		sa.withdraw(10000);
	}

}

