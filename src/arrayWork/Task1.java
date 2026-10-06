package arrayWork;

import java.util.Arrays;

public class Task1 {

	public static void reverse(int ar[]) {
		int start = 0, end = ar.length - 1;
		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;

			start++;
			end--;
		}
	}

	public static boolean isPalindrome(int ar[]) {
		int start = 0, end = ar.length - 1;
		while (start < end) {
			if (ar[start] != ar[end])
				return false;

			start++;
			end--;
		}
		
		return true;
	}

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 2,1 };
		System.out.println(ar[0]);
		System.out.println(Arrays.toString(ar));

		reverse(ar);

		System.out.println("====================");
		System.out.println(Arrays.toString(ar));

		System.out.println(ar[0]);
		
		System.out.println(isPalindrome(ar));

	}
}
