package arrays;

import java.util.Arrays;

public class kthSamllestElement {

	static int smallestk(int ar[],int k)
	{
		Arrays.sort(ar);
		return ar[k-1];
	}
	
	public static void main(String[] args) {
		int a[] = {7,10,10,4,20,15};
		System.out.print(smallestk(a,4));

	}

}
