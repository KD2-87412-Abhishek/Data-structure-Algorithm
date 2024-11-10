package Searching_assingment4;

import java.util.Comparator;
import java.util.Scanner;

public class Employeeidsearch  {
	static Scanner sc =new Scanner(System.in);
	int id ;
	String name;
	
	public Employeeidsearch(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	static public int binarysearch(Employeeidsearch[] arr, int key) {
//		int binarysearch=0;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if (key==arr[mid].id) {
//				binarysearch++;
//				System.out.println(" THE NO OF PASSES of binary search= "+binarysearch);
				
			System.out.println(arr[mid].toString());
			return mid;
			}
			else if(key<arr[mid].id) {
//				binarysearch++;
				end=mid-1;
				
			}
			else {
					start=mid+1;
			}	
		}return -1;
	}
	static public int binarysearchname(Employeeidsearch[] arr, String key) {
//		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if (key.equals(arr[mid].name)) {// equal
//				
//				
				
			System.out.println(arr[mid].toString());
			return mid;
			}
			else if(key.compareTo(arr[mid].name)==-1) {
//				
				end=mid-1;
				
			}
			else {
					start=mid+1;
			}	
		}System.out.println("not found");
		return -1;
	}

	public static void main(String[] args) {
		 Employeeidsearch[] employees = new Employeeidsearch[]{ new Employeeidsearch(1, "Aman"), new Employeeidsearch(2, "Abhi"), new Employeeidsearch(3, "Ashish")};
		 System.out.println("enter the key ");
		 
		 int key =sc.nextInt();
		 String key2 =sc.next();
		 
binarysearch(employees,key);
binarysearchname(employees, key2);
}
	
	
}
