package arrays;

import java.util.Arrays;

public class MiddleElement {

	static int middle(int ar[])
	{
		Arrays.sort(ar);
		int mid = ar.length/2;
		return ar[mid];
	}
	public static void main(String[] args) {
		int a[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		System.out.print(middle(a));

	}

}
