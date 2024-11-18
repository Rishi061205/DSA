package largest;
public class Soln {

	public static void main(String[] args) {
		int[] arr= {10,20,40,50,60};
		int res = LargestElem(arr);
            System.out.println("The largest number found is: " + res);
		}
	static int LargestElem(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
