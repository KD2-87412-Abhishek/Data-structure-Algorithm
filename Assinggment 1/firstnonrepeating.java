package Searching_assingment4;

import java.util.Scanner;

public class firstnonrepeating {
	static Scanner sc= new Scanner(System.in);

	// to find first non repeating element using linear serach
	// we have to itterate the element and compare with the key elment
	static public int linearsearch(int []arr ){
		
		
		 int count=0;
		 for (int i = 0; i < arr.length; i++) {
			 count =0;
			 for (int j=i+1;j<arr.length-1;j++) {
				  
			 
			 if (arr[i]==arr[j]) {// comaparing thr element one by one 
//				 System.out.println(i);
				 count++;
				 continue;
		 }
	}
		if(count==0) {
			 System.out.println(arr[i]);
			 return arr[i];
		 }
		
	 }return -1;
 }
		
			
		public static void main(String[] args) {
			int[]arr= {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
			 
			 
			 linearsearch(arr);
			
		
	}

}
