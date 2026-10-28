package arrayWork;

import java.util.Arrays;

public class Task5 {
	
	public static void reverseArray(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
	}
	
	public static void reverse(int ar[]) {
		int start = 0, end = ar.length - 1;
		while(start <= end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(ar));
		reverse(ar);
		System.out.println(Arrays.toString(ar));
		
	}
}
