package com.examples.oca.override_overload;

public class SuperClass {

	/**
	 * Se crea variable por default
	 */
	public String value = "Valor original de la variable";

	/**
	 * Se crea metodo que recibe dos parametros
	 * 
	 * @param one
	 * @param two
	 */
	public void methodTwo(String one, String two) {
		System.out.println("Value one " + one + "from superclass");
		System.out.println("Value two " + two + "from superclass");
	}

	/**
	 * Metodo que regresa un string
	 * 
	 * @return
	 */
	public String methodThree() {
		System.out.println("Pintando valor original");
		return "valor original";
	}

	/**
	 * Metodo que lanza un nullpointer exception
	 * 
	 * @throws NullPointerException
	 */
	public void methodNullPointer() throws NullPointerException {
		System.out.println("Pintando null pointer exception original");
	}

	/**
	 * Metodo que regresa un String
	 * 
	 * @return
	 */
	public String returnString() {
		return "Retornando un String desde superclase";
	}

	/**
	 * Metodo estatico
	 */
	public static void staticMethod() {
		System.out.println("Metodo estatico desde superclass");
	}

	/**
	 * Metodo final
	 */
	public final void finalMethod() {
		System.out.println("Metodo final desde superclass");
	}

	/**
	 * Metodo original
	 */
	public void oveloadedMethod() {
		System.out.println("Metodo oveloadedMethod uno sin parametros");
	}

}
