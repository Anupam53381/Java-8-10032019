package com.zensar;

import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=10;i++) {
			System.out.println(i);
		}*/
		
		//inital value
	//	condition
	//	increment
		
		IntStream.iterate(0,(n)->n+1)
		.limit(10)
		.forEach((n)->System.out.println(n));
		
		
		
		

	}

}
