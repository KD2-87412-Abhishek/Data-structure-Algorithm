package Assingment04;

import java.util.Scanner;

public class Emp {
	static Scanner sc= new Scanner (System.in);
	static class node{
		int id;
		String name;
		double salary;
		node next;
		node prev;
	
	public node () {
		next=prev=null;
		
	}
	 public node(int id, String name, double salary) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.next = null;
			this.prev = null;
		}
	@Override
	public String toString() {
		return "node [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	}
	 
	node head;
	 node tail;
	 int size=0;
	 
	 public Emp() {
		 head= tail=null;
	 }
	 public void addEmp(int id,String name,double sal ) {
		 node nn=new node(id,name,sal);
		 if(head==null) {
			 head=nn;
			 tail=nn;
		 }
		 else {
			 nn.next=head;
			 nn.prev=tail;
			 head.prev=nn;
			 tail.next=nn;
			 head=nn;
		 }
	 }
		 public void display() {
			 node trav= head;
			 do {
				 System.out.println(trav.toString());
			trav=trav.next;
			
		} while (trav!=head);
	}
		 public void searchName(String name) {
			 node trav= head;
			 do {
				 if(name.equalsIgnoreCase(trav.name)) {
					 System.out.println(trav.toString());
				 		return;
				 }
			trav=trav.next;
			
		}while (trav!=head);
			 
	}
	public void deleteByID(int id) {
		node trav=head;
		 do {
			 if(id==trav.id) {
				 System.out.println("id removed"+trav.id);
				 trav.prev.next=trav.next;
				 trav.next.prev=trav.prev;
			 		return;
			 }
		trav=trav.next;
		
	}while (trav!=head);
		 }
	public void updateByID(int id,double sal) {
		node trav=head;
		 do {
			 if(id==trav.id) {
				 trav.salary= sal;
			 		return;
			 }
		trav=trav.next;
		
	}while (trav!=head);
		 }
	
	public static int menu() {
		System.out.println("1.add emp");
		System.out.println("2.disp emp");
		System.out.println("3.search emp");
		System.out.println("4.delete emp");
		System.out.println("5.update emp");
		int choice=sc.nextInt();
		return choice;
		
	}
	
	
	public static void main(String[] args) {
		Emp e= new Emp();
		int choice;
		while(( choice=menu())!=0)
		switch (choice) {
		case 1:System.out.println("enter id , name ,salary");
			e.addEmp(sc.nextInt(), sc.next(), sc.nextDouble());
			break;
		case 2:e.display();
				break;
		case 3:System.out.println("enter name to search");
			e.searchName(sc.next());
				break;
		case 4:System.out.println("enter id to delete");
						e.deleteByID(sc.nextInt());
		
			break;
		case 5:System.out.println("enter id to update and salary");
		e.updateByID(sc.nextInt(), sc.nextDouble());
		default:System.out.println("enter de fault id ");
			break;
		}
	
		
	
	}
 }




	
	
