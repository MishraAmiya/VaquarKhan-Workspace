package com.funtional.interfaces.example04;

import java.util.Collection;

public interface Demo {

	// Only abstract method.
	void abc(Collection<?> collection);

	void def(Collection<?> collection);

	void ghe(Collection<?> collection);

	// Functional interface can have more than one static or default methods.

	default void cdf() {
		System.out.println("This is default in Functional Interface.");
	}

	// And also can override methods of java.lang.Object
	@Override
	public String toString();

}
