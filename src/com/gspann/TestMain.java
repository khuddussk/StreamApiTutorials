package com.gspann;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(75, 85, 96, 44, 12, 36, 63, 45, 44);

		// 1.Find Out List Of Even Number

		List<Integer> listOfEven = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(listOfEven);

		// 2.Find out duplicate elements from list

		Set<Integer> hs = new HashSet<Integer>();

		List<Integer> collect = list.stream().filter(e -> !hs.add(e)).collect(Collectors.toList());
		System.out.println("Duplicate Element in List  : "+collect);

		// 3. Max number

		Integer integer = list.stream().max((x, y) -> x.compareTo(y)).get();

		System.out.println("max number :" + integer);

		// 4.Sorted list

		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List : " + sortedList);
		
		
		
	}

}
