package com.examples.oca.katy_sierra_oca.chapterTwo.question_15;

interface I1 {
	default int doStuff() {
		return 1;
	}

}

interface I2 {
	default int doStuff() {
		return 2;
	}

}

//public class MultiInt implements I1, I2 {
//
//	public static void main(String[] ags) {
//		new MultiInt().go();
//	}
//
//	void go() {
//		System.out.println(doStuff());
//	}
//
//	// int doStuff() {//Error, Para sobreescribir el método debe ser publico.
//	return 3;
//}
//}
