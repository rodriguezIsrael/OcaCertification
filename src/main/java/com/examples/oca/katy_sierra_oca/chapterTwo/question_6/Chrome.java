package com.examples.oca.katy_sierra_oca.chapterTwo.question_6;

class X { void do1() {}}

class Y extends X{ void do2() {}}

public class Chrome {
	public static final void main(String args[]) {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
//		x2.do2();// No compila
//		(Y)x2.do2(); // No compila
		((Y) x2).do2(); // COMPILA	
	}
}
