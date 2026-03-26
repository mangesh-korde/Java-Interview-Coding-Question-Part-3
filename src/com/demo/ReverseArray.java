package com.demo;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		// Reverse Array Using second Array.....
		Scanner sc=new Scanner(System.in);
		int[] a= {2,1,45,2,7};
		
		int index=0;
		int newArr[]= new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			newArr[index]=a[i];
			index++;
		}
		for(int num:newArr)
		{
			System.out.println(num);
		}
	}
}
