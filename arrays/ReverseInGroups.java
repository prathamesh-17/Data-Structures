package arrays;

import java.util.Arrays;

public class ReverseInGroups {

	static int[] reverse(int ar[],int k)
	{
		for(int i=0; i<ar.length; i+=k)
		{
			int left = i;
			int right = Math.min(i+k-1, ar.length-1);
			int temp;
			while(left<right)
			{
				temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				left++;
				right--;
			}
		}
		return ar;
	}
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.print(Arrays.toString(reverse(a,3)));
		
	}

}
