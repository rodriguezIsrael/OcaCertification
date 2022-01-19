package com.examples.oca.katy_sierra_oca.chapterTwo.question_8;

class Dog{
	public void bark() {System.out.print("woof ");}
}

class Hound extends Dog{
	public void sniff() {System.out.print("sniff ");}
	public void bark() {System.out.print("how 1");}
}

public class DogShow {

	void go() {
		new Hound().bark();
		((Dog)new Hound()).bark();
//		((Dog)new Hound()).sniff();//Error debido a que noe xiste sniff en el la clase Dog
	}
	
}
