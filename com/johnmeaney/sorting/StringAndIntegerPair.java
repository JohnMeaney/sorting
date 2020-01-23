package com.johnmeaney.sorting;

public class StringAndIntegerPair implements Comparable<StringAndIntegerPair> {
	private String stringVar;
	private int intVar;
	
	public StringAndIntegerPair(String stringVar, int intVar) {
		super();
		this.stringVar = stringVar;
		this.intVar = intVar;
	}

	public String getStringVar() {
		return stringVar;
	}

	public int getIntVar() {
		return intVar;
	}

	@Override
	public int compareTo(StringAndIntegerPair otherPair) {
		return this.intVar - otherPair.intVar;
	}


	

}
