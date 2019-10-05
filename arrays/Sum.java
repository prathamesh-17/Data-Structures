package arrays;

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

public class Sum {

	static int count(int a[],int sum)
	{
		int c=0;
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]>sum)
				{
					c++;
				}
			}
		}
		return c;
		
	}
	public static void main(String[] args) {
		int a[] = {2, 7, 11, 15},target=24;
		
		System.out.print(count(a,target));
		
	}

}
