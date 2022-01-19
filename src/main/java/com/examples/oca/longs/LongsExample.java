package com.examples.oca.longs;

public final class LongsExample {

	public static final void main(String... strings) {
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		int i3 = 1;
		byte b1 = 1;
		Long g1 = 1L;
		System.out.println(i1 == i2); // debe mostrar false debido a que esta comparando las referencias
		System.out.println(i1 == i3); // debe mostrar true debido a que realiza un outboxing
		System.out.println(i1 == b1); // debe mostrar true.
		System.out.println(i1.equals(i2)); // debe mostrar true
		System.out.println(i1.equals(g1)); // debe mostrar true
		System.out.println(i1.equals(b1)); // debe mostrar true

	}

}
