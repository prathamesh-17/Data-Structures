package arrays;

import java.util.Scanner;

public class TrapRainWater {

	static int waterCount(int a[])
	{
		int water = 0;
		int left[] =new int[a.length];
		int right[] = new int[a.length];
		
		left[0] = a[0];
		right[a.length-1] = a[a.length-1];
		
		for(int i=1; i<a.length; i++)
			left[i] = Math.max(left[i-1], a[i]);
		
		for(int j=a.length-2; j>=0; j--)
			right[j] = Math.max(right[j+1], a[j]);
		
		for(int i=0; i<a.length; i++)
			water += Math.min(left[i], right[i]) - a[i];
		
		return water;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int j=0; j<n; j++)
		    {
		        a[j] = sc.nextInt();
		    }
		    for(int j=0; j<n; j++)
		    {
		        System.out.print(a[i]+" ");
		    }
		    System.out.print(waterCount(a));
		}
		sc.close();
	}

}
