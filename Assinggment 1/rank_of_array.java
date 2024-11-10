package Searching_assingment4;

import java.util.Scanner;

public class rank_of_array {
	static Scanner sc= new Scanner(System.in);

	// rank toatal no element less then or equl to x
	static public void linearsearch(int []arr ,int key){
		int count=0;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i]==key || arr[i]< key) {
				 count++;
			 }
			 else 
				 continue;
			 }
			  System.out.println(" rank " +count); 
			
		}
		
	public static void main(String[] args) {
		int[]arr= {10, 20, 15, 3, 4, 4, 1};
		 System.out.println("enter key");
		 int key =sc.nextInt();
		 linearsearch(arr,key);
		 
}
	}
