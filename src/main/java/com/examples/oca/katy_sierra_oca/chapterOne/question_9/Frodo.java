package com.examples.oca.katy_sierra_oca.chapterOne.question_9;

public class Frodo extends Hobbit {

	public static void main(String[] args) {
		int myGold = 7;
		System.out.println(countGold(myGold, 6));
	}
}

class Hobbit {
	int countGold(int x, int y) {return x + y;}
}
