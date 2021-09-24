package datastructure;

public class Queue {

	private final int MAX_SIZE = 100;

	private int front;
	private int rear;

	private int[] queue = new int[MAX_SIZE];
	
	public void main() {
		Queue queue = new Queue();
		
		for(int i = 0; i< 5; i++) {
			queue.enqueue(i+1);	
		}
		while(!queue.isEmpty()) {
			queue.dequeue();
			
		}
		
		System.out.println("complete");
	}

	public void init() {
		front = 0;
		rear = 0;
	}

	public boolean isEmpty() {
		return (front == rear);
	}

	public boolean isFull() {
		
		if ((rear + 1) % MAX_SIZE == front) {
			return true;
		} else {
			return false;
		}
	}

	public boolean enqueue(int value) {

		if (isFull()) {
			System.out.println("queue is full!");
			return false;
		}
		queue[rear] = value;
		rear++;
		if (rear == MAX_SIZE) {
			rear = 0;
		}
		return true;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty!");
			throw new RuntimeException();
		}
		int value = queue[front];
		front++;
		if(front == MAX_SIZE) {
			front = 0;
		}
		return value;
	}
}
