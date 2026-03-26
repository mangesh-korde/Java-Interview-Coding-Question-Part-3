package com.demo;

import java.util.Scanner;

public class ZeroNumberEndOfArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[]= {12,4,0,4,0,31,2};
		
		int newArr[]=new int[a.length];
		
		
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				newArr[index]=a[i];
				index++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				newArr[index]=a[i];
				index++;
			}
		}
		
		for(int num:newArr)
		{
			System.out.println(num);
		}
	}
}
