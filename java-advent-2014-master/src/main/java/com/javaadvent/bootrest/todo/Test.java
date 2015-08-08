package com.javaadvent.bootrest.todo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>  partyA = new ArrayList<Integer>();
		
		partyA.add(12);
		partyA.add(11);
		partyA.add(5);
		partyA.add(2);
		partyA.add(7);
		partyA.add(5);
		partyA.add(-11);
		
		List  partyB = new ArrayList<Integer>();
		
		partyB.add(5);
		partyB.add(12);
		partyB.add(5);
		partyB.add(7);
		partyB.add(11);
		partyB.add(2);
		partyB.add(11);

		
		for(int result:partyA){
			
			if(result < 0){
				System.out.println("Invalid number"+result);
			}
		}

	}

}
