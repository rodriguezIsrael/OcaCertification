package com.examples.oca.katy_sierra_oca.chapterOne.question_2;

/**
 * @author isivroes

 */
class Rocket {
	private void blastOff() {
		System.out.print("bang ");
	}
}

public class Shuttle extends Rocket {

	public static void main(String[] args) {
		new Shuttle().go();

	}

	void go() {
		// ¿A quien se invoca? //R: Se invoca al blastOff de la misma clase,
		// en caso de requerir invocar al blastOff de la clase padre
		// el metodo blastOff de Rocket deberia de ser publico y se debera de mandar a
		// llamar con super.blastOff();
		blastOff();
		//Rocket.blastOff();// ¿Que sucede si se descomenta esta linea? R: El código falla debido a que 
		// el metodo blastOff de Rocket es privado y no se tiene acceso a el

	}

	 void blastOff() {
		System.out.print("sh-bang ");
	}

}