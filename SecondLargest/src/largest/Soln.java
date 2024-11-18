package largest;

import java.util.Arrays;

public class Soln {

	public static void main(String[] args) {
		int[] arr= {10,20,40,50,60};
		int res = SecondLargest(arr);
            System.out.println("The second largest number found is: " + res);
		}
	
	static int SecondLargest(int arr[]) {
		Arrays.sort(arr);
		int max=arr[0];
		int res=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				res=max;
				max=arr[i];
				
			}
		}
		return res;
	}

}
