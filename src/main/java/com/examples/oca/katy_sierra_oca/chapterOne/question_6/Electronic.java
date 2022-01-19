package com.examples.oca.katy_sierra_oca.chapterOne.question_6;

/**
 *Se implementa la clase device en electronic
 */
public class Electronic implements Device {
	public void doIt() {//Se implementa el metodo doIt de Device
	}
}

/**
 * Se hereda la clase Electronic y ya no es requerido implementar nada
 *
 */
abstract class Phone1 extends Electronic {
	
}

/**
 * Se hereda la clase Electronic y ya no es requerido implementar nada y el nuevo metodo doIt se 
 * sobrecarga
 *
 */
abstract class Phone2 extends Electronic {
	public void doIt(int x) {
	}
}

/**
 * Se implementa la inferface Device
 * y al mismo tiempo se extiende de Electronic,
 * por tal motivo no es requerido implementar el metodo doIt
 * por lo cual el metodo doStuff es valido
 *
 */
class Phone3 extends Electronic implements Device {
	public void doStuff() {
	}
}

/**
 * Se crea interface Device
 */
interface Device {
	public void doIt();
}
