package com.examples.oca.override_overload;

public class Demo {

	public final static void main(String args[]) {

		SubClass subClass = new SubClass();

		System.out.println("Pintando el valor de la variable: " + subClass.value);

		subClass.methodTwo("hola", "adios");

		subClass.methodNullPointer();

		subClass.staticMethod();
		SuperClass.staticMethod();
		SubClass.staticMethod();
		subClass.finalMethod();
		String result = subClass.methodThree();
		System.out.println(result);
		subClass.oveloadedMethod();
		subClass.oveloadedMethod("Valor x");

	}

}
