package Searching_assingment4;

import java.util.Scanner;

public class nth_occurance {
	
		static Scanner sc = new Scanner (System.in);
		static int occurance=0; 
		static public void linearsearch(int []arr ,int key){
			 for (int i = 0; i < arr.length; i++) {
				 
				 if (arr[i]==key) {
					 System.out.println("the element found at position "+i);
					 occurance++; 
				 }	 
				
			}
			 System.out.println("the elemaent occured no of times"+occurance);
			
		}
	public static void main(String[] args) {
		
			int[]arr= {44,11,55,66,11,11,11,77,33};
			 System.out.println("enter key");
			 int key =sc.nextInt();
			 linearsearch(arr,key);
			
	}

}
