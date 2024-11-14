package Assingment04;

public class Stack_queue_LL {
	static class node{
		int data;
		node next;
		node prev;
		node(int value){
			data=value;
			next=prev=null;
		}
	} node head;
	node tail;
	
	public boolean isEmpty() {
		
			return head==null;
		}
		
		public void pop(){
			if(isEmpty())
				System.out.println("empty");
			else
			tail.next=head.next;
			head.next.prev=tail;
			head=head.next;
			
			return ;
		}
		public void push(int value) {
			
		node nn=new node(value);
		if(isEmpty())
			head=tail=nn;
		else
		nn.next=head;
		nn.prev=tail;
		tail.next=nn;
		head.prev=nn;
		head=nn;
	}
		public void display() 
		{ if (isEmpty()) {
			System.out.println("The list is empty."); 
			return; }
		node temp = head;
		System.out.print("Elements: ");
		while (temp.next != head) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			}
		System.out.print(temp.data);
		}
		int peek() {
	        if (!isEmpty())
	            return head.data;
	        else {
	            System.out.println("\nStack is empty");
	            return 0;
	        }
		}
		
	

	public static void main(String[] args) {
		Stack_queue_LL s= new Stack_queue_LL();
		s.push(5);
		s.push(6);
		s.push(4);
		s.display();
		s.pop();
		System.out.println("/////////////////");
		s.display();
		s.peek();
		
	}

}
