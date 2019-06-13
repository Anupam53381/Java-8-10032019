package com.zensar;

import java.util.function.Consumer;

public class Test2 {

	public static void main(String[] args) {
	
		Consumer<Person> person= (p)->{
			System.out.println(p.getPersonName());
			System.out.println(p.getPersonAge());
		};
		
		person.accept(new Person(1,"Ram",20));

	}

}
