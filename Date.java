package com.lftechnology.training.oop;

import java.lang.reflect.Constructor;
import java.util.Calendar;


public class Date {
	int month;
	int day;
	int year;
	
	public Date(){
		Calendar date=Calendar.getInstance();
		day=date.get(Calendar.DAY_OF_MONTH);
		month=date.get(Calendar.MONTH);
		year=date.get(Calendar.YEAR);
	}
	
	public void setDay(int day){
		this.day=day;
	}
	
	public void setMonth(int month){
		this.month=month;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	
	public int getDay(int day){
		return day;
	}
	
	public int getMonth(int month){
		return month;
	}
	
	public double getYear(int year){
		return year;
	}
	
	public void displayDate(){
		System.out.println("Correct date is "+month+"/"+day+"/"+year);
	}
	
}