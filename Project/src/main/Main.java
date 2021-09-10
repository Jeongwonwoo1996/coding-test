package main;

import datastructure.Stack;

public class Main {

	public static void main(String[] args) {
		
		java.util.Stack<String> elevator = new java.util.Stack<String>();
		//elevator.init();

		elevator.push("우종성");
		elevator.push("정원우");

		int number = 0;
		while (elevator.isEmpty() == false) {
			number++;
			
			System.out.println("내린 사람 순서 : " + number + " " + elevator.pop());
		}
	}

}
