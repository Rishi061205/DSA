package largest;
public class Soln {

	public static void main(String[] args) {
		int[] arr= {100,20,40,500,60};
		int res = LargestElem(arr);
            System.out.println("The largest number found is: " + res);
		}
	static int LargestElem(int arr[]) {
		int max=arr[0];
		for(int n:arr) {
			if(n>max) {
				max=n;
			}
		}
		return max;
	}
}
