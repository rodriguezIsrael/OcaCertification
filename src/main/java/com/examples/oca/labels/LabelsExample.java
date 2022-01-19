package com.examples.oca.labels;

/**
 * 
 * Se muestra el uso y diferencia de interrumpir ciclos sin labels y con labels
 * (break y continue)
 * 
 * @since 14/01/2020
 * @author isivroes
 *
 */
public class LabelsExample {

	public static final void main(String... strings) {

		System.out.println("---------------- EJEMPLO SIN LABEL ----------------");
// En este ejemplo el for mas interno encontrara un break, por lo cual cancelara la ejecucion de ese ciclo pero no cancelara la ejecucion de los ciclos externo
		for (int i = 0; i < 10; i++) {
			System.out.println("Pintando i: " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("Pintando j: [solo se interrumpe el ciclo en donde se encuentre el break] " + j);
				for (int k = 0; k < 10; k++) {
					System.out.println("Pintando k: " + k);
					break;
				}
			}
		}

		System.out.println("---------------- EJEMPLO CON LABEL ----------------");
		// En este caso en cuanto se encuentra un break, se detiene tooda la ejecucion
		// del codigo en donde se encuentra el label
		labelFor: for (int i = 0; i < 10; i++) {
			System.out.println("Pintando i: " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("Pintando j: " + j);
				for (int k = 0; k < 10; k++) {
					System.out.println("Pintando k: " + k);
					break labelFor;
				}
			}
		}

		System.out.println("---------------- EJEMPLO CON CONTINUE ----------------");
// EN este ejemplo el continue interrumpe el ciclo pero redirigiendonos en donde se encuentre el label, omitiendo el flujo mas externo
		for (int i = 0; i < 10; i++) {
			System.out.println("Pintando i: " + i);
			labelContinue: for (int j = 0; j < 10; j++) {
				System.out.println("Pintando j: " + j);
				for (int k = 0; k < 10; k++) {
					System.out.println("Pintando k: " + k);
					continue labelContinue;
				}
			}
		}

	}

}
