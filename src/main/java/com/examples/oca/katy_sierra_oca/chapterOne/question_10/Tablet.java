package com.examples.oca.katy_sierra_oca.chapterOne.question_10;

interface Gadget{
    void doStuff();
}



  class Electronic{
	void getPower() {System.out.print("plug in ");}
}
public class Tablet extends Electronic implements Gadget{

	public void doStuff() { 
		System.out.print("show book ");
	}
	
	public static void main(String[] args) {
		new Electronic().getPower();
		new Tablet().doStuff();
	}

}
