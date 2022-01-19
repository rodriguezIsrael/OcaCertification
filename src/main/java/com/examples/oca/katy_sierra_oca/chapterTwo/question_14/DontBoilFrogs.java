package com.examples.oca.katy_sierra_oca.chapterTwo.question_14;

interface FrogBoilable {

	static int getCtoF(int cTemp) {
		return (cTemp * 9 / 5) + 32;
	}

	default String hop() {
		return "hopping ";
	}
}

public class DontBoilFrogs implements FrogBoilable{

	void go() {
		System.out.print(hop());
//		System.out.print(getCtoF(100)); error
		System.out.print(FrogBoilable.getCtoF(100));// Aqui si compila por que se invoca mediante la interface
		DontBoilFrogs dbf = new DontBoilFrogs();
//		System.out.println(dbf.getCtoF(100));// Error, getCtoF no pertenece a la clase DontBoilFrogs
	}
}
