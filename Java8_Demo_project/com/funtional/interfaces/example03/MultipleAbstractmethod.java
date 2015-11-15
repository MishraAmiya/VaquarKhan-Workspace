package com.funtional.interfaces.example03;

@FunctionalInterface
public interface MultipleAbstractmethod {

	double calculate(int a);
/**
 * Default method
 * @param a
 * @return
 */
	default double sqrt(int a) {
		return Math.sqrt(a);
	}

	/**
	 * Object class method
	 * @param obj
	 * @return
	 */
    boolean equals(Object obj);

    public  int hashCode();


}
