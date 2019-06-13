package com.zensar;

import java.util.function.Predicate;

public class Test {
	
	public static void perform(Predicate<Integer>p,int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(p.test(arr[i]));
			
		}
		
	}
	

	public static void main(String[] args) {
	
		
		
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		
		Predicate<Integer> p1=n->n%2==0;
		
		//Test.perform(p1, numbers);
		
		Predicate<Integer> p2=i->i>5;
		
		//Test.perform(p2, numbers);
		
		
		//Predicate<Integer> p3=p1.and(p2);
		
		//Test.perform(p3, numbers);
		
	/*	Predicate<Integer> p4=p1.or(p2);
		
		Test.perform(p4, numbers);*/
		
		Predicate<Integer> p5=p1.negate();
		
		Test.perform(p5, numbers);
		
		
		
		

		/*
		 * Printable p=new Printable() {
		 * 
		 * @Override public void print() { System.out.println("Some impl");
		 * 
		 * } };
		 * 
		 * p.print();
		 * 
		 * }
		 */

		// Printable p= () -> System.out.println("Some impl !!!");

		// Prime Number 11 1, 11

		/*
		 * TestInterface var = (a) -> {
		 * 
		 * boolean flag=false;
		 * 
		 * for(int i=2;i<a;i++) { if(a%i==0) { flag=true; break; }
		 * 
		 * } return flag;
		 * 
		 * };
		 */

		/*TestInterface i = (n) -> {

			if (n % 2 == 0) {
				return true;
			}
			return false;
		};*/
		
		//TestInterface i1 = (n) -> n%2==0;

		/* Predicate<Integer> i2 = (n) -> n%2==0;

		System.out.println(i2.test(23));*/

		/*
		 * boolean result=var.isPrime(12);
		 * 
		 * if(result) System.out.println("Not Prime"); else {
		 * System.out.println("Prime"); }
		 */

		// System.out.println(var.giveMeASqur(11));

	}

}
