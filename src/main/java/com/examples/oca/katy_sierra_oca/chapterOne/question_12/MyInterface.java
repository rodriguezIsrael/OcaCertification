package com.examples.oca.katy_sierra_oca.chapterOne.question_12;

interface MyInterface {

//	public static m1() {;} // marca error por no tener tipo de retorno

	default void m2() {
		;
	} // compila

	abstract int m3();

//	final short m4() {return 5;} // no es valido un modificador de acceso final en una interface.

//	default long m5();//un método default debe tener un cuerpo

	static void m6() {
		;
	}
}
