package com.demo;

public class EvenOddSeparate {

	 public static void main(String[] args) {
		
		 int a[]= {2,5,2,8,1,5};
		 int b[]=new int[a.length];
		 
		 System.out.println("Original Array..........");
		 for(int num:a)
		 {
			 System.out.println(num);
		 }
		 int index=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]%2==0)
			 {
				 b[index]=a[i];
				 index++;
			 }
		 }
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]%2!=0)
			 {
				 b[index]=a[i];
				 index++;
			 }
		 }
		 
		 System.out.println("After Separating Even And Odd.........");
		 for(int num:b)
		 {
			 System.out.println(num);
		 }
	}
}
