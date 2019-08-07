package com.java.lambda.platzi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Click click = (String element) -> { System.out.println("Clickeaste "+element);};
		click.click("Image");
		
		OnOneListener oneListener = new OnOneListener() {
			
			@Override
			public void onOne(String message) {
				// TODO Auto-generated method stub
				System.out.println("One: "+message);
			}
		};
		
		OnOneListener oneListener2 = (String message) -> {
			System.out.println("One: "+message);
		};
		
		oneListener.onOne("Sin lambda :(");
		oneListener2.onOne("Con lamda :)");
		
		OnOneListener oneListener3 = message -> System.out.println("Tu mensaje " + message);
		oneListener3.onOne("mas ccorta");
		
		//Operador ::
		List<String> lista = new ArrayList<>();
		lista.add("uno");
		lista.add("dos");
		lista.forEach(System.out::println);
		
		List<String> words = Arrays.asList("hello",null,"");
		words.stream().filter(t -> t != null).filter(t -> !t.isEmpty()).forEach(System.out::println);

	}

}
