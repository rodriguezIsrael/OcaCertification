package com.examples.oca.override_overload;

public class SubClass extends SuperClass {

	public String value = "Valor de la subclass";

	/**
	 * Se sobreescribe el metodo {@link methodTwo} que vive en {@link SuperClass}
	 */
	public void methodTwo(String one, String two) {
		System.out.println("Value one " + one + "from subclass");
		System.out.println("Value two " + two + "from subclass");
	}

	/**
	 * Se sobreescribe el metodo {@link methodThree} que vive en {@link SuperClass}
	 * sin importar que sea privado
	 */
	public String methodThree() {
		System.out.println("Pintando valor desde subclass");
		return "valor desde subclass";
	}

	/**
	 * Se sobreescribe el metodo {@link methodNullPointer} que vive en
	 * {@link SuperClass} y se cambia la excepcion que va a lanzar dado que en el
	 * metodo original de {@link SuperClass} se lanza un nullpointerexception
	 */
	public void methodNullPointer() throws OutOfMemoryError {
		System.out.println("Pintando null pointer exception original");
	}

	/**
	 * Se sobreescribe el metodo {@link staticMethod} que vive en {@link SuperClass}
	 * sin importar que sea privado
	 */
	public static void staticMethod() {
		System.out.println("Metodo estatico desde subclass");
	}

	/**
	 * Intentamos sobreescribir un metodo que regresa un String en la superclass
	 * pero en la subclass intentamos retornar un booleano por lo cual marca error
	 * 
	 * @return
	 */
//	public boolean returnString() {
//		return true;
//	}

	/**
	 * Se sobre escrecarga metodo
	 * 
	 * @param x
	 */
	public void oveloadedMethod(String x) {
		System.out.println("Sobrecargando String " + x);
	}

	/**
	 * No se puede sobrecargar metodo solo con cambiarle el tipo de retorno, el
	 * compilador marca error, por tal motivo se comenta este metodo
	 * 
	 * @param x
	 * @return
	 */
//	public boolean oveloadedMethod(String x) {
//		System.out.println("Sobrecargando String " + x);
//	}

	/**
	 * Se intenta sobreescribir el metodo {@link finalMethod} que proviene
	 * {@link Demo} {@link SuperClass}, pero como tiene un modificador de acceso
	 * final, el compilador no lo permite, por eso se encuentra el código comentado
	 */
//	public final void finalMethod() {
//		System.out.println("Metodo final creado en la subclass");
//	}
}
