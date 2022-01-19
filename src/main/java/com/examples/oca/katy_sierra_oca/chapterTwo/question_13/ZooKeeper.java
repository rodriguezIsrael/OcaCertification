package com.examples.oca.katy_sierra_oca.chapterTwo.question_13;

class Mammal{
	String name = "furry ";// Polimorfismo no aplica para variables
	String makeNoise() { return "generic noise";}//Polimorfisco aplica para metodos
}

class Zebra extends Mammal{
	String name = "stripes ";
	String makeNoise() { return "bray";}
}

public class ZooKeeper {

	public static void main(String[] sd) {
		new ZooKeeper().go();
	}
	
	void go() {
		Mammal m = new Zebra();
		System.out.println(m.name+ m.makeNoise());
	}
}
