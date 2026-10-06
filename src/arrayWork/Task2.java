package arrayWork;

public class Task2 {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 10, 20, 30, 30, 50, 90, 40 };
//					                                     i 
		
//		Set<Integer> set = new LinkedHashSet<>();
//		
//		for (int a : ar)
//			set.add(a);
//
//		System.out.println(set);
		
		
		int result[] = new int[ar.length]; // [10, 20, 30, 50, 90, 40, 0, 0, 0, 0]
		int k = 0;						  //                       k
		
		for(int i=0; i<ar.length; i++) {
			boolean flag = false;
			for(int j=0; j<k; j++) {
				if(ar[i] == ar[j]) {
					flag = true;
					break;
				}
			}
			
			if(flag == false) {
				result[k]  = ar[i];
				k++;
			}
		}

	}
}
