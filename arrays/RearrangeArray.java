package arrays;


/*
 * Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively
 *  i.e first element should be max value, second should be min value, 
 * third should be second max, fourth should be second min and so on...
 * 
 * Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
Input: arr[] = {1, 2, 3, 4, 5, 6}
Output: arr[] = {6, 1, 5, 2, 4, 3} 
 */
public class RearrangeArray {
	
	static int[] rearrange(int arr[])
	{
		int n = arr.length;
		int arr1[] = new int[n];
		int min = 0 , max = n-1;
		boolean flag = true;
		for(int i=0; i<n; i++)
		{
			if(flag)
			{
				arr1[i] = arr[max--];
			}
			else
			{
				arr1[i] = arr[min++];
			}
			 flag = !flag;
		}
		
		return arr1;
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		int temp[] = rearrange(arr);
		for(int i=0; i<temp.length; i++)
		{
			System.out.print(temp[i]+" ");
		}
		
	}

}
