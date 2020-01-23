package com.johnmeaney.sorting;
import java.util.*;
public class Sorter {

	public static void main(String[] args) {
		// Set up a list of pairs
		List<StringAndIntegerPair> myList = new ArrayList<>();
		myList.add(new StringAndIntegerPair("Bob", 30));
		myList.add(new StringAndIntegerPair("Alan", 90));
		myList.add(new StringAndIntegerPair("Zack", 22));
		myList.add(new StringAndIntegerPair("David", 31));
		myList.add(new StringAndIntegerPair("Helena", 12));
		System.out.println("ORIGINAL LIST:");
		System.out.println("==============");
		for (StringAndIntegerPair pair: myList) {
			System.out.println(pair.getStringVar() + " " + pair.getIntVar());
		}
		
		
		// sort the list
		Collections.sort(myList);
		
		System.out.println("SORTED LIST:");
		System.out.println("============");
		for (StringAndIntegerPair pair: myList) {
			System.out.println(pair.getStringVar() + " " + pair.getIntVar());
		}
				

	}

}
