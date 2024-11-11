package Assingment03;

import Searching_assingment4.Linked_list;


public class singlelinkedlist {
	

	// node class
	static class node{
		int data;
		node next;
		// node consutructer 
		node(int value){ 
			data=value;
			next= null;
		}
	}
	node head;
	//constructer of linked list 
	public singlelinkedlist() {
		// head
		head= null;
	}
	
	public void add(int value) {
		
		 // create a new node
		node n= new node(value);
		// add the node value 
		n.data= value;
		n.next=head; // head which at astring is null
		
		// refrance the head to the next value 		
		head=n;
//
	}

	public void display() {
		// create a traversal and print the node.data
		// go to next node traverse node.next
		
		 node trav = head;
		 while(trav!=null) {
			 System.out.println("the node data is "+trav.data);
			 trav= trav.next;
		 }
		 
			
		}
	public void addlast(int value) {
		// taverse to the last 
		node n =new node(value);
		node trav1= head;
		while(trav1.next!=null) {
			trav1=trav1.next;
		}
		n.next=null;
		trav1.next=n;
		

	}
	
// add at a posiition	
	public void addpos(int value,int pos) {
		node trav2=head;
		node npos= new node(value);
	for (int i = 1; i < pos; i++) {
		trav2=trav2.next;
	}
	npos.next=trav2.next;
	trav2.next=npos;
	}
	
	public void deletefirst() {
		if (head == null)
		{
			return;
			} 
		
		if (head.next == null) { 
			head = null; return;
		}
		else {
		node trav3=head;	
	head=trav3.next;
	
	}
	}
public void deletelast() {
	if (head == null)
	{
		return;
		} 
	if (head.next == null) { 
		head = null; return;
	}
	
		
	else{
		node trav4=head;
	
	while(trav4.next.next!=null) {
		trav4=trav4.next;
	
	}
	trav4.next=null;
}
}
	

	public static void main(String[] args) {
		Linked_list mylist = new Linked_list();
		
		mylist.add(5);
		mylist.add(7);
		mylist.add(8);
		mylist.add(9);
		mylist.add(10);
		mylist.add(11);
		mylist.addlast(99);// last
		mylist.addpos(90,3);
		mylist.display();
		System.out.println("/////////////////////////////////////////////////////////////");
		mylist.deletefirst();
		mylist.deletelast();
		mylist.display();
		
		
		// TODO Auto-generated method stub

	}

}

