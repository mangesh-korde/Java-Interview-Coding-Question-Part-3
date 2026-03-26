package com.demo;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		int a[]= {1,3,5};
		int b[]= {2,4,6};
		
		int newArr[]= new int[a.length+b.length];
		
		int i=0,j=0;
		int index=0;
	   while( i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				newArr[index]=a[i];
				index++;
				i++;
			}
			else
			{
				newArr[index]=b[j];
				index++;
				j++;
			}
		}
		
	   while(i<a.length)
	   {
		   newArr[index]=a[i];
		   i++;
		   index++;
	   }
		

	   while(j<b.length)
	   {
		   newArr[index]=b[j];
		   j++;
		   index++;
	   }
		for(int num:newArr)
		{
			System.out.println(num);
		}

}
	
}