package com.demo;

public class MethodOverloading 
{

	
	// 1.First Method Which takes Both integer value
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition Of Two Integers :"+c);
	}
	
	
	//2. Second method which takes one int and second float value..
	public void add(int a, float b)
	{
		float c=a+b;
		System.out.println("Addition of (int,float) is :"+c);
	}
	
	
	//3.Third Method Which takes both double type of value
	public void add(double a,double b)
	{
		double c=a+b;
		System.out.println("Addition of(double,double) is :"+c);
	}
	public static void main(String[] args) 
	{
		
            MethodOverloading m=new MethodOverloading();
            
            m.add(12,56);
            
            m.add(2, 6.2f);
            
            m.add(3.4, 7.3);
            
            
            
	}
}
