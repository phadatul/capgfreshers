package com.capgemini.ui;

public class Demo {
	public static void main(String[] args) {

		String x = "12abc";
		try {
			Integer.parseInt(x);
			//yourmethod(int);
		} catch (NumberFormatException e) {

			throw new InvalidAgeException();
			
		} catch (InvalidAgeException e) {

		}

	}

}
