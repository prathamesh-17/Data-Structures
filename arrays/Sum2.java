package arrays;

import java.util.Arrays;

/*
Given an array of integers, find how many pairs in the array such that 
their sum is bigger than a specific target number. Please return the number of pairs.
Example
numbers=[2, 7, 11, 15], target=24
return 1
Challenge
Either of the following solutions are acceptable:
O(1) Space, O(nlogn) Time
Tags Expand 
Two Pointers
*/

public class Sum2 {

	static int count(int a[],int sum)
	{
		int c=0;
		int left=0,right=a.length-1;
		Arrays.sort(a);
		while(left<right)
		{
			if(a[left]+a[right]>sum)
			{
				c+=(right-left);
				right--;
			}
			else
			{
				left++;
			}
		}
		
		return c;
		
	}
	public static void main(String[] args) {
		int a[] = {15, 17, 11, 2,7},target=24;
		
		System.out.print(count(a,target));
		
	}

}
