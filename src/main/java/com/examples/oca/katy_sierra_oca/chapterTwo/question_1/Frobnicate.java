package com.examples.oca.katy_sierra_oca.chapterTwo.question_1;

public abstract interface Frobnicate {

	public void twiddle(String s);
}

abstract class FrobOne implements Frobnicate {
//	public abstract void twiddle(String s) {} // Un método abstracto no tiene cuerpo
}

abstract class FrobTwo implements Frobnicate {
}

//class FrobThree extends Frobnicate{ // no se puede heredar una interface en una clase
//	public void twiddle(Integer i) {}	
//}

//Se debe implementar el método de la interce, se esta intentando sobrecargar
// class FrobFour implements Frobnicate { 
//	public void twiddle(Integer i) {}
//}

class Frob implements Frobnicate{

	public void twiddle(String i) {}
	
	public void twiddle(Integer s) {}
	
}
