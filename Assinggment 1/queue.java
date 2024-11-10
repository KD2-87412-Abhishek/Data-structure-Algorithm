package Searching_assingment4;

public class queue {
	 private  int size;
	 private int front;
	 private int rear;
	  private int[] arr;
	 public queue(int size) {
		 size=size;
		 arr= new int[size];
		 front = rear = -1;
		 
	 }
	 public void push(int value) {
		 rear++;
		 arr[rear]=value;
		 System.out.println(arr[rear]);
		 
		 
		 
	 }
	 public int pop() {
		 if(isEmpty()==0) {
		 // if queue is not empty
			 	int temp= arr[front++];
		 		
		 		System.out.println(temp);
		 		return temp;
	 }
		 return 0;
	 }
	 public int  peek() {
		 System.out.println(arr[front+1]);
		return arr[front+1];
		
		 
	 }
	public int  isEmpty() {
		if ((front == rear && front ==-1)) {
				System.out.println(" its empty ");
					return 1 ;
		}	
		return 0;
	}
		public int full() {
			if(rear==size-1) {
				System.out.println(" its full ");
								return 0;
		}
			return 1;	
	}
		public void  display() {
			for (int i : arr) {
				System.out.println(arr[i]);
				
			}
				
			}
			



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queue myque=new queue (5);
		myque.push(5);
		myque.push(6);
		myque.push(7);
		myque.peek();
		myque.push(9);
		myque.push(10);
		myque.push(11);
		
	}

}
