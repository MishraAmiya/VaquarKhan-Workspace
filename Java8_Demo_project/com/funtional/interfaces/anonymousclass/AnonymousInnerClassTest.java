package com.funtional.interfaces.anonymousclass;

public class AnonymousInnerClassTest {

	public static void main(String... args) {

		/*
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() {
		 * System.out.println("a therad is created and running anonymous" );
		 * 
		 * } }).start();
		 */

		new Thread(
				() -> System.out
						.println("a therad is created and running -lambda exp"))
				.start();

		/***
		 * So in above code, compiler automatically deduced that lambda
		 * expression can be casted to Runnable interface from Thread class’s
		 * constructor signature public Thread(Runnable r) { }.
		 */

		/**
		 * Difference between Lambda Expression and Anonymous class
		 * 
		 * One key difference between using Anonymous class and Lambda
		 * expression is the use of this keyword. For anonymous class ‘this’
		 * keyword resolves to anonymous class, whereas for lambda expression
		 * ‘this’ keyword resolves to enclosing class where lambda is written.
		 * 
		 * Another difference between lambda expression and anonymous class is
		 * in the way these two are compiled. Java compiler compiles lambda
		 * expressions and convert them into private method of the class. It
		 * uses invokedynamic instruction that was added in Java 7 to bind this
		 * method dynamica
		 */

	}
}
