package com.examples.oca.katy_sierra_oca.chapterOne.question_8;

public class TestDays {
	public enum Days{MON,TUE,WED};
	public static void main(String[] args) {
		for(Days d:Days.values())
			;
		Days [] d2 = Days.values();
		System.out.println(d2[2]);
	}
}