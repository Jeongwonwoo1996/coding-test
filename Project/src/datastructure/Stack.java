package datastructure;

public class Stack {

	private final int MAX_SIZE = 10;
	
	private int top = 0;
	private String[] stack = new String[MAX_SIZE];
	
	public void init() {
		top = 0;
	}
	
	public boolean isFull() {
		return (top == MAX_SIZE);
		
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}

	public void push(String value) {
		if(isFull()) {
			return;
		}
		stack[top] = value;
		top++;
	}
	
	public void print() {
		for (int i = 0; i < top; i++) {
			System.out.println(stack[i]);
		}
	}

	public String pop() {
		if(isEmpty()) {
			throw new RuntimeException();
		}
		top--;
		return stack[top];
	}
}
