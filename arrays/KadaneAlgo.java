package arrays;

import java.util.Scanner;

// Largest Sum Contiguous Subarray

public class KadaneAlgo {

	static int subarray(int a[])
	{
		int max_so_far = 0, max_end_here = 0;
		for(int i=0; i<a.length; i++)
		{
			max_end_here = max_end_here + a[i];
			
			if(max_end_here < 0)
				max_end_here = 0;
			
			else if(max_so_far < max_end_here)
				max_so_far = max_end_here;
		}
		return max_so_far;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int j=0; j<n; j++)
			{
				arr[j] = sc.nextInt();
			}
			System.out.print(subarray(arr));
		}	
		sc.close();
		}
}

/*
 * Kadane’s Algorithm:

Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_ending_here < 0)
            max_ending_here = 0
  (c) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
return max_so_far


 */
