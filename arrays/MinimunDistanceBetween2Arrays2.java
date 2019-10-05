package arrays;

/*
 * Input: arr[] = {3, 4, 5}, x = 3, y = 5
Output: Minimum distance between 3 and 5 is 2.

Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6
Output: Minimum distance between 3 and 6 is 4.
 */

public class MinimunDistanceBetween2Arrays2 {

	static int minDistance(int a[],int x,int y)
	{
		int mind = Integer.MAX_VALUE;
		int i=0;
		int prev=0;
		for(i=0; i<a.length; i++)
		{
			if(a[i] == x || a[i] == y)
			{
				prev = i;
				break;
			}
		}
		for(;i<a.length;i++)
		{
			if(a[i] == x || a[i] == y)
			{
				if(a[i] != a[prev] && mind>(i-prev))
				{
					mind = i-prev;
					prev = i;
				}
				else
					prev = i;
			}
			
		}
		return mind;
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 5, 3, 4, 2, 6, 5, 5, 4, 8, 3}, x = 3, y = 6;
		
		System.out.print(minDistance(arr,x,y));
	}

}
