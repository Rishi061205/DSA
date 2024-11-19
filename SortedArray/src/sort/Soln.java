package sort;

public class Soln {

	public static void main(String[] args) {
		int[] a= {4,10,6,8,3};
		if(SortedArr(a)==true) {
			System.out.print("the array is sorted.");
		}else {
			System.out.print("the array is not sorted.");
		}
	}
	
	static boolean SortedArr(int arr[]) {
		int size=arr.length;
		
		for(int i=0;i<size-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}

}
