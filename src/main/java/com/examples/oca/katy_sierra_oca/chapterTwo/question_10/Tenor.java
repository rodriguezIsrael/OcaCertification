package com.examples.oca.katy_sierra_oca.chapterTwo.question_10;

public class Tenor extends Singer {
	
	static String s ="hola";
	
	public static String sing() {
		return "fa";
	}

	public static void main(String[] args) {
		Tenor t = new Tenor();
		Singer s = new Tenor();
		System.out.println(t.sing() + " " + s.sing());
	}
	
	
}

class Singer {
	public static String sing() {
		return "la";
	}


}