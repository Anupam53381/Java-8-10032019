package com.zensar;

import java.util.ArrayList;
import java.util.function.Function;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<Integer> evenNumberList = new ArrayList<>();

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Function<Integer, Boolean> f1 = (n) -> {
			if (n % 2 == 0)
				evenNumberList.add(n);

			return false;
		};
		
		Function<Integer, Boolean> f2 = (n) -> {
			if (n % 2 == 0)
				evenNumberList.add(n);

			return false;
		};
		
		

		for (int i = 0; i < numbers.length; i++) {
			f1.apply(numbers[i]);
		}

		System.out.println("Even numbers are");

		for (Integer i : evenNumberList) {
			System.out.println(i);
		}

	}

}
