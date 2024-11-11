package Assingment03;

public class circularqueuecounter {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	
	private int counter; 
	public circularqueuecounter(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		counter=0;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("full");
			
		}
		//1. reposition rear (inc)
		rear = (rear + 1) % SIZE;
		//2. add value at rear index
		arr[rear] = value;
		counter++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		int temp = arr[(front + 1) % SIZE];
		//1. reposition front (inc)
		front = (front + 1) % SIZE;
		counter--;
		
		//2. if front and rear are equal, move them back to -1
		if(front == rear)
			front = rear = -1;
		return temp;
		
	}
	
	public int peek() {
			if(isEmpty()) {
				System.out.println("empty");
				return 0;
			}
			
		//1. read/return data of front end
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isEmpty() {
		return counter==0;
	}
	
	public boolean isFull() {
		return counter==SIZE;
	}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circularqueuecounter q1= new circularqueuecounter(5);
//		q1.push(5);
//		q1.push(5);
//		q1.push(5);
//		q1.push(5);
//		q1.push(5);
//		//
//		q1.push(5);
		q1.pop();
		
		
	}

}

