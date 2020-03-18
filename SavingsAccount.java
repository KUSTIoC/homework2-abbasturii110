package com.lftechnology.training.oop;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;


public class SavingsAccount {
	static int annualInterestRate;
	private float savingsBalance;


	public SavingsAccount(float balance){
		savingsBalance=balance;
		System.out.println("Deposited balance: "+savingsBalance);
		
	}


	public void calculateMonthlyInterest() {
		float interest = ((savingsBalance * annualInterestRate) / 12);
		savingsBalance += interest;
	}


	public static void modifyInterestRate(int annualRate) {
		annualInterestRate = annualRate;
	}


	public void display() {
		System.out.println("New Balance is : " + savingsBalance);
	}
}