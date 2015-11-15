package com.funtional.interfaces.example02;

@FunctionalInterface
public interface Formula {

	double calculate(int a);
/**
 * Default method
 * @param a
 * @return
 */
	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
