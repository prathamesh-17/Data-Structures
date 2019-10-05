package arrays;

import java.util.Arrays;

public class tripletProductLessThanSum2 {
	
	static int count(int a[],int sum)
	{
		int c=0;
		Arrays.sort(a);
		for(int i=0; i<a.length-2; i++)
		{
			int start=i+1,end=a.length-1;
			while(start<end)
			{
				if(a[start]+a[end]+a[i]<sum)
				{
					c+=end-start;
					start++;
				}
				else
				{
					end--;
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int a[] = {3,1,-2, 0},target=2;
		
		System.out.print(count(a,target));
		

	}

}
