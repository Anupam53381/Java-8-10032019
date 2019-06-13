package com.zensar;

// JDBC APL- Java(6)

//MYSQL Oracle  Sysbase


/*interface TestInterface {

	//void test3();
	
	public default void newTest() {
		// dummy impls,default impl
		System.out.println("default impl");
	}

}*/

/*@FunctionalInterface
interface MyTestInterface extends TestInterface{
	
	void test3();
	
	
}*/

public interface DefaultMethodDemo {

	public abstract void test1();
	
	public abstract void test2();

	public default void newTest() {
		// dummy impls,default impl
		System.out.println("default impl");
	}

	public static void display() {
		System.out.println("Hi");
	}
	
	
	
	
	

}




interface MyInterface {

	public default void newTest() {
		System.out.println("default impl of MyInterface");
	}

}

class A implements DefaultMethodDemo, MyInterface {



	public void newTest() {
		// MyInterface.super.newTest();
		// DefaultMethodDemo.super.newTest();
		System.out.println("impl of newTest");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

}










