package arrays;

import java.util.*;
//Find whether an array is subset of another array

public class SubsetArray {

	static boolean subset(int a[],int b[])
	{
		Set<Integer> m = new HashSet<Integer>();
		for(int i=0; i<a.length; i++)
		{
			m.add(a[i]);
		}
		for(int j=0; j<b.length; j++)
		{
			if(m.contains(b[j]) != true)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int a[] = {11, 1, 13, 21, 3,7};
		int a2[] = {11, 3, 7};
		
		System.out.print(subset(a,a2));

	}

}
