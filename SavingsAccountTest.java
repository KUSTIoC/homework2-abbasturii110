package com.lftechnology.training.oop;


public class SavingsAccountTest {
		
	public static void main(String[] arg){
		
		SavingsAccountTest accountTest=new SavingsAccountTest();
		SavingsAccount saverOne=new SavingsAccount(2000);
		SavingsAccount saverTwo=new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(4);
		saverOne.calculateMonthlyInterest();
		saverTwo.calculateMonthlyInterest();
		saverOne.display();
		saverTwo.display();
		
		
		SavingsAccount.modifyInterestRate(5);
		saverOne.calculateMonthlyInterest();
		saverTwo.calculateMonthlyInterest();
		saverOne.display();
		saverTwo.display();
						
		
		
		
	}

}