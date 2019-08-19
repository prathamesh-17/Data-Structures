package arrays;

import java.util.Arrays;

public class Merge2SortedArrays {

	static void merge(int arr1[],int arr2[])
	{
		int m = arr1.length , n = arr2.length;
		for(int i=n-1; i>=0; i--)
		{
			int j, last = arr1[m-1];
			for(j=m-2;j>=0 && arr1[j] > arr2[i];j--)
				arr1[j+1] = arr1[j];
			
			if(j != m-2 || last > arr2[i])
			{
				arr1[j+1] = arr2[i];
				arr2[i] = last;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int arr1[] = {1, 5, 9, 10, 15, 20}; 
		int arr2[] = {2, 3, 8, 13}; 
		
		merge(arr1,arr2);
		
		System.out.print(Arrays.toString(arr1)+Arrays.toString(arr2));
		

	}

}
