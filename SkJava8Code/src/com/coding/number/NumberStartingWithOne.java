package com.coding.number;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().filter(n -> String.valueOf(n).startsWith("1")).forEach(System.out::println);
	}

}
