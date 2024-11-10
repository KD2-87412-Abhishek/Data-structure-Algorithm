package Searching_assingment4;

import java.util.Scanner;

public class linearandbinarysearch {
	static Scanner sc=  new Scanner (System.in);
	static public int linearsearch(int []arr ,int key){
		int linearsearchcomp=0;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i]==key) {
				 
				 System.out.println(i);
				 System.out.println("THE NO OF PASSES of linear search "+linearsearchcomp);
				 return i;
				 
			 }
			 linearsearchcomp++;
			
			
		}  System.out.println("not found ");
		
		return -1; 
		
	}
	static public int binarysearch(int[] arr,int key) {
		int binarysearch=0;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if (key==arr[mid]) {
				binarysearch++;
				System.out.println(" THE NO OF PASSES of binary search= "+binarysearch);
			System.out.println(mid);
			return mid;
			}
			else if(key<arr[mid]) {
				binarysearch++;
				end=mid-1;
				
			}
			else {
					start=mid+1;
			}	
		}
		System.out.println("element not found");
		return -1;
		
	}

	public static void main(String[] args) {
		int[]arr= {44,11,55,66,77,33};
		 System.out.println("enter key");
		 int key =sc.nextInt();
		 linearsearch(arr,key);
		  binarysearch(arr,key);

	}

}
