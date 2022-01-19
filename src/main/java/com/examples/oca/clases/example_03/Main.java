package com.examples.oca.clases.example_03;

public class Main {

	public static void main(String args[]) {
		Man man = new Man();
		Human human = man;
		human.hands = 3;
		human.eyes = 3;
		System.out.println("man-hands: " + man.hands);
		System.out.println("man-eyes: " + man.eyes);
	}
}
