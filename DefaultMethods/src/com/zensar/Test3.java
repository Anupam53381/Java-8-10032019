package com.zensar;

import java.util.Arrays;
import java.util.List;

public class Test3 {
	
	public static void test(String s) {
		System.out.println(s);
	}
	
	public static String test2() {
		return "Hi";
	}

	public static void main(String[] args) {
		
		/*String[] weather= {"Rainy","Cloudy","Sunny","Windy"};
		
		int random=ThreadLocalRandom.current().nextInt(0,4);
		
		Supplier<String> s=()->{
			return weather[random];
		};
		
		System.out.println(s.get());*/
		
		
		
		
		List<String> al=Arrays.asList("Rainy","Cloudy","Sunny","Windy");
		
		//al.forEach(test());
		
		
	//Consumer<String> c=	(String s)->{System.out.println(s);};//->accept()
		
		//Person p=new Person(1,"Ram",10);
		
		//ClassName::methodNAme
		
		//object::methodNAme
		
		//al.forEach(s->System.out.println(s)); //internal iteration 
		
	//	System-> class 
	//	out->Static 
	//	println
		al.forEach(System.out::println);
		
		//String::new
		
		//System.out.println("Ram");
		
		
		
	/*	for(int i=0;i<weather.length;i++) {
			System.out.println(weather[i]);
		}*/
		
		/*for(String w:weather) {
			System.out.println(w);
		}*/
		
		/*Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		
	}

}
