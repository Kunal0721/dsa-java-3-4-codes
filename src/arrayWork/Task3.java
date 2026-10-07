package arrayWork;

import java.util.Arrays;

public class Task3 {

	public static void reverse(int ar[], int start, int end) {
		while (start <= end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		
		}
	}

	public static void rotate(int ar[], int k) {
		if (k > ar.length) {
			k = k % ar.length;
		}
		reverse(ar, 0, ar.length - k - 1);
		reverse(ar, ar.length - k, ar.length - 1);
		reverse(ar, 0, ar.length - 1);
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(ar));
		rotate(ar, 12);
		System.out.println(Arrays.toString(ar));
	}
}
