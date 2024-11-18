package threelargest;

public class Soln {

	public static void main(String[] args) {
		int arr[] = { 1,20,45,60,4,1 };
        ThreeLargest(arr);
	}
	
	static	void ThreeLargest(int arr[]) {
		int m1,m2,m3;
		m1=m2=m3=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>m1) {
				m3=m2;
				m2=m1;
				m1=arr[i];
			}else if(arr[i]>m2) {
				m3=m2;
				m2=arr[i];
			}else if(arr[i]>m3) {
				m3=arr[i];
			}
		}
	System.out.println("the largest numbers are :"+m1+","+m2+","+m3);

	}
}
