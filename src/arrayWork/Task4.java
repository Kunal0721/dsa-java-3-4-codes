package arrayWork;

import java.util.Arrays;

public class Task4 {
	public static int[] insertAtHead(int ar[], int data) {
		int newar[] = new int[ar.length + 1];  // [0, 0, 0, 0, 0, 0]
		newar[0] = data;  // [21, 0, 0, 0, 0, 0]
		
		for(int i=1; i<newar.length; i++) {
			newar[i] = ar[i-1];
		}
		
//		i  = 1
//		newar[1] = ar[0]   , [21, 11, 0, 0, 0, 0]
//    i=2, newar[2] = ar[1], [21, 11, 8, 0, 0, 0]
// 	  i=3, newar[3] = ar[2], [21, 11, 8, 19, 0, 0]
		
		return newar;
	}
	
	public static int[] insertAtEnd(int ar[], int data) {
		int newar[] = new int[ar.length + 1];   // [11, 8, 0, 0, 0, 0]
		for(int i=0; i<ar.length; i++) {
			newar[i] = ar[i];
		}
		
		// i = 0, newar[0] = ar[0]
		// i = 1, newar[1] = ar[1] => newar[1] = 8
		
		newar[newar.length - 1] = data;
//		newar[5]
		return newar;
	}
	
	// [11, 8, 19, 20, 12] ,  67, 2
	
	// [11, 8, 67, 19, 20, 12]
	
	public static int[] insertAtPosition(int ar[], int data, int position) {
		if(position < 0  || ar.length <= position) {
			System.err.println("Invalid position :  " + position);
			return ar;
		}
		
		if(position == 0) {
			return insertAtHead(ar, data);
		}
		
		int newar[] = new int[ar.length + 1];  // [0, 0, 0, 0, 0, 0]
		for(int i=0; i<position; i++) {  // i = 1 , newar[1] = ar[1]
			newar[i] = ar[i];
		}
		newar[position] = data;  // newar[2] = 67
		
		for(int i=position; i<ar.length; i++) {  
			newar[i+1] = ar[i];
		}
		
			// i = 2, newar[3] = ar[2]
			// i = 3, newar[4] = ar[3]
			// i = 4, newar[5] = ar[4]
		
		return newar;
	}
	
	public static void printArray(int ar[]) {
		System.out.println(Arrays.toString(ar));
	}
	
	public static void main(String[] args) {
		int ar[] = {11, 8, 19, 20, 12};
		printArray(ar);
//		ar = insertAtHead(ar, 21);
//		printArray(ar);
//		ar = insertAtHead(ar, 31);
//		printArray(ar);
//		ar = insertAtEnd(ar, 100);
//		printArray(ar);
//		ar = insertAtEnd(ar, 201);
//		printArray(ar);
		
		ar = insertAtPosition(ar, 67, 2);
		printArray(ar);
		ar = insertAtPosition(ar, 78, 8);
		printArray(ar);
		
		
	}
}
