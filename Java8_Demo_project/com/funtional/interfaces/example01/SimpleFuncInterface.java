package com.funtional.interfaces.example01;

@FunctionalInterface
public interface SimpleFuncInterface {
	
	//public void doNothing();
	//public void doWntork();
	/**
	 * Note we can not have more then one method if you annotated @FunctionalInterface
	 * only one abstract method required 
	 */
	public abstract void doWork();
	
	
	
}
