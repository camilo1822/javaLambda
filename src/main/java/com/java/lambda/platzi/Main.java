package com.java.lambda.platzi;

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

	}

}
