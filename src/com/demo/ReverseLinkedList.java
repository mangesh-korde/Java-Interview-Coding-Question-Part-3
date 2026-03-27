package com.demo;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		
		list.add("Aman");
		list.add("Ram");
		list.add("Aakash");
		
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
