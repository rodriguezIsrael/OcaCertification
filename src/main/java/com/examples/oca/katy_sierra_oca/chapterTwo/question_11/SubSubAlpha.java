package com.examples.oca.katy_sierra_oca.chapterTwo.question_11;

class Alpha {
	static String s = " ";

	protected Alpha() {
		s += "alpha ";
	}
}

class SubAlpha extends Alpha {
	private SubAlpha() {
		s += "sub ";
	}
}

public class SubSubAlpha extends Alpha {

	private SubSubAlpha() {
		s += "subsub ";
	}
	
	public static void main(String[] argjh) {
		new SubSubAlpha();
		System.out.println(s);
	}
}


