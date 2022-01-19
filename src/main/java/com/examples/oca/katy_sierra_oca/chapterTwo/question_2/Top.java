package com.examples.oca.katy_sierra_oca.chapterTwo.question_2;

public class Top {
	public Top(String s) {System.out.print("B");}
}


class Bottom2 extends Top{
	
	// Genera error por que se deberia de invocar al constructor padre
//	public Bottom2(String s) {System.out.print("D");}

	// Ejemplo: Asi deberia de verse
	public Bottom2(String s) {
		super(s);
	}

	public static void main(String[] args) {
		new Bottom2("C");
		System.out.println(" ");
	}
}