package com.examples.oca.katy_sierra_oca.chapterOne.question_5.pkgB;
import com.examples.oca.katy_sierra_oca.chapterOne.question_5.pkgA.*;

/**
 * la variable a es default package y al intentarse invocar no se encuentra pues esta
 * en un package diferente.
 * la variable b esta protegida y solo pueda usarse en el mismo package o en diferente package
 * pero mediante herencia.
 * @author isivr
 *
 */
public class Baz {
	public static final  void main(String[] args) {

		Foo f = new Foo();
		System.out.println(" "+ f.a); //No la encuentra debido a que es default package
		System.out.println(" "+ f.b); //No la encuentra por que esta protegida
		System.out.println(" "+ f.c);
	}
}
