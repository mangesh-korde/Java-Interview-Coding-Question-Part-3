package com.demo;

public class TransferZeroAtEndOfArray {

	public static void main(String[] args) {
		
		int a[]= {4,5,0,1,0,2};
		
		int newArr[]=new int[a.length];
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				newArr[k]=a[i];
				k++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				newArr[k]=a[i];
				k++;
			}
		}
		
		System.out.println("Zero's at end of array :");
		for(int num:newArr)
		{
			System.out.println(num);
		}
	}
}
