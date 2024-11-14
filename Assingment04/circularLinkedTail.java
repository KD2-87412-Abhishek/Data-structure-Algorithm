package Assingment04;



public class circularLinkedTail {
	 static class node{
		 int data;
		 node next;
		 
	 node (int value){
		 data=value;
		 next=null;
		 
	 }
	 }
	 node tail; int size;
	 public circularLinkedTail() {
		 tail = null;
	}
	 public void addfirst(int value) {
		 node nn =new node(value);
		 if(tail==null) {
			 tail=nn;
			tail.next=tail;
			 
			 
		 }
		 else {
			 nn.next=tail.next;
			 tail.next=nn;
		 }
		 
	 }public void display() {
			node trav=tail.next;
			
			do {
				
				System.out.println(trav.data);
				trav= trav.next;
			}while(trav!=tail.next);}
	 
	 public void addlast(int value){
		 node nn=new node(value);
		 if(tail==null) {
			 tail=nn;
			 tail.next=tail;
		 }
		 else {
			 nn.next=tail.next;
			 
			 tail.next=nn;
			 tail=nn;
		 }size++;
		 
	 }public void addposition(int value,int pos) {
		//1. create a node
		 node nn =new node(value);
		 //traversal
		 node trav=tail.next;
		 for (int i = 1; i < pos-1; i++) {
			 trav=trav.next;	 
		}
		 nn.next=trav.next;
		 trav.next=nn;
		 
		 size++;}
	
public void deletefirst() {
if(tail==null) {
	return;
}
else if( size==1) {
	tail=null;
}

else {
	
	tail.next=tail.next.next;
	
}
size--;}
public void deletelast() {
	if(tail==null) {
		return;
	}
	else if( size==1) {
		tail=null;
	}
	else {
		node trav= tail.next;
		
		while(trav.next!=tail) {
		trav=trav.next;
		
	}
	trav.next=tail.next;
	tail=trav;
	}
	size--;
}
public void deletepos( int pos) {
	if(tail==null) {
		return;
	}
	else if( size==1) {
		tail=null;
	}
	else if(pos==1){
		deletefirst();
	}
	else if(pos==size){
		deletelast();
	}
	else {
node trav= tail.next;
		
		for(int i=1;i<pos-1;i++) {
		trav=trav.next;
		
	}
		trav.next=trav.next.next;
	}
	size--;
	
}
	 
	public static void main(String[] args) {
		circularLinkedTail c1= new circularLinkedTail();
		c1.addfirst(10);
		c1.addfirst(20);
		c1.addfirst(30);
		c1.addlast(40);//last
		c1.addposition(99, 3);// third
//		c1.deletefirst();
		//c1.deletelast();
		c1.deletepos(3);
		c1.display();
		
	

	}

}
