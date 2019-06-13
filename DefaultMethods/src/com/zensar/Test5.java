package com.zensar;

import java.util.stream.IntStream;

public class Test5 {
	
	public static void main(String[] args) {
		
		
		int[] numbers= {11,3,4,5,6,71,8,9,10,2};
		
		/*int min=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		
		System.out.println("Minimum number is "+min);*/
		
		
		System.out.println(IntStream.of(numbers).summaryStatistics().getCount());
		
		/*numbers.stream().filter(n->{
			System.out.println("Ram");
			return false;
		});
		
		*/
		
		
		
		
		//numbers.stream().
		
		
		
		/*List<Integer> evenNumberList=new ArrayList<>();
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				
				evenNumberList.add(numbers[i]);
			}
		}
		
		for(Integer i:evenNumberList)
			System.out.println(i);*/
		
	//	employees.stream().map(e->e+500).forEach(System.out::println);
		
	/*	Stream<Integer> stream = employees.stream();
		
		Stream<Integer>newStream=stream.filter(n->n%2==0);
		
		newStream.forEach(System.out::println);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 // intermidiate op-> stream(),filter(),map()
		 
		 // terminal operation collect()
		
		
		
		
		
		
		
		
		/* List<Integer> numbers2=.filter(n->n%2==0).collect(Collectors.toList());
		
		 for(Integer i:numbers2)
				System.out.println(i);*/
		
		
		
	}
	
	

}
