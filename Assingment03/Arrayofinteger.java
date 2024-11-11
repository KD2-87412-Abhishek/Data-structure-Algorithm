package Assingment03;

import java.util.Stack;

public class Arrayofinteger {

	public static void main(String[] args) {
		int[]arr= {0,1,2,3,4,5};
		Stack s = new Stack();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
			
		}
		for (int j = 0; j < arr.length; j++) {
		  int temp= (Integer)s.pop();
		  arr[j]=temp;
//		  System.out.println(arr[j]);
			
		}
		for (int a : arr) {
			System.out.println(a);
			
		}
		
		
		

	}

}
