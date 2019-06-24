package com.java.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * EJEMPLO DE EXPRESIONES JAVA CON LAMBDA
 *
 */
public class App {
	public static void main(String[] args) {
		// DIRECTO
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(n -> System.out.print(n + " "));
		System.out.println();

		// CON INTERFACE
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		// NORMAL
		print(animals, new CheckIfHopper());
		// CON LAMBDA, SE DEFINE LA INTERFACE PERO NO ES NECESARIA LA CLASE QUE
		// IMPLEMENTA EL METODO DE LA INTERFACE, YA QUE LA IMPLEMENTACION DE DICHO
		// METODO ES EN LA LAMBDA, ES DECIR LA CLASE <CODE>CheckIfHopper</CODE> SOBRA
		print(animals, a -> a.canSwim());
		print(animals, a -> a.canHop());
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}

}
