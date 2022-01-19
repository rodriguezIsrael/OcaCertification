package com.examples.oca.katy_sierra_oca.chapterTwo.question_3;

public class Clidder {
	private final void flipper() {
		System.out.println("Clidder");
	}
}

class Clidlet extends Clidder {
	public final void flipper() {
		System.out.println("Clidlet");
	}

	public static void main(String[] args) {
		new Clidlet().flipper();
	}
}