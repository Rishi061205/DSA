package leader;
import java.util.*;

public class Soln {

	public static void main(String[] args) {
		int[] a= {4,10,6,8,3};
		List<Integer> myLeaders=LeaderList(a);
		System.out.println("Leaders : "+myLeaders);}
	
	static List<Integer> LeaderList(int arr[]) {
		int size=arr.length;
		int leader=Integer.MIN_VALUE;
		List<Integer> leaders = new ArrayList<Integer>();
		for(int i=size-1;i>=0;i--) {
			if(arr[i]>leader) {
				leaders.add(arr[i]);
				leader=arr[i];
			}
		}
		return leaders;
	}

}

