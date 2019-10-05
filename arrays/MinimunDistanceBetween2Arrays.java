package arrays;

/*
 * Input: arr[] = {3, 4, 5}, x = 3, y = 5
Output: Minimum distance between 3 and 5 is 2.

Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6
Output: Minimum distance between 3 and 6 is 4.
 */

public class MinimunDistanceBetween2Arrays {

	static int minDistance(int a[],int x,int y)
	{
		int mind = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[i] == x && a[j] == y) || (a[i] == y && a[j] == x) && Math.abs(i-j)<mind)
				{
					mind = Math.abs(i-j);
				}
			}
		}
		return mind;
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6;
		
		System.out.print(minDistance(arr,x,y));
	}

}
