package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Calculator {

	public int addAtoB(int a, int b) {
		return a + b;
	}

	public int substractAFromB(int a, int b) {
		return a - b;
	}
}
public class Application {

	public static void main(String[] args) {
	Calculator calculator = new Calculator();
	int result = calculator.addAtoB(2,5);
		System.out.println(result);
	}
}
