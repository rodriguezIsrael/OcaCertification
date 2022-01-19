package com.examples.oca.katy_sierra_oca.chapterTwo.question_16;

interface MyInterface{
	default int doStuff() {
		return 42;
	}
}

public class IfaceTest implements MyInterface{

	public static void main(String agsd[]) {
		new IfaceTest().go();
	}
	void go() {
		System.out.println("class: "+ doStuff());
//		System.out.println("class: " + super.doStuff());//error
		System.out.println("class: " + MyInterface.super.doStuff());
//		System.out.println("class: " + MyInterface.doStuff());//error, deberia de ser static doStuff
//		System.out.println("class: " + super.MyInterface.doStuff());//error
	}
	
	public int doStuff() {
		return 43;
	}
}
