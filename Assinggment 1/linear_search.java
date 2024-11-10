package Searching_assingment4;

import java.util.Scanner;

public class linear_search {
	static Scanner sc = new Scanner (System.in);
	static public void linearsearch(int []arr ,int key){
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i]==key) {
				 
				 System.out.println(i);
			 }
			 else System.out.println("not found "); 
			
		}
		
	}
//
	public static void main(String[] args) {
		int[]arr= {44,11,55,66,77,33};
		 System.out.println("enter key");
		 int key =sc.nextInt();
		 linearsearch(arr,key);
		
		
		
	}
}
