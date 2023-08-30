package org.abijeeth.jdbc;

import java.util.ArrayList;
     import java.util.ListIterator;


public class MyListIterater {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
			
		}
		System.out.println();
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous()+" ");
		}
	}
	
}

