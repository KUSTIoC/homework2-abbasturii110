package com.lftechnology.training.oop;


 */
public class DateTest {
	
	public void display(Date date){
		System.out.println("Set Date is "+date.month+"/"+ date.day+"/"+date.year);
		
	}
	public static void main(String[] arg){
		Date objFirstDate=new Date();
		Date objSecondDate=new Date();
		DateTest objTest=new DateTest();
		objFirstDate.displayDate();
		
		objFirstDate.setDay(23);
		objFirstDate.setMonth(12);
		objFirstDate.setYear(2014);
		
		objSecondDate.setDay(2);
		objSecondDate.setMonth(9);
		objSecondDate.setYear(1990);
		
		
		objTest.display(objFirstDate);
		objTest.display(objSecondDate);
		
		
	}

}