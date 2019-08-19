package arrays;

import java.util.Scanner;

public class MissingElement {

	static int missing(int a[])
	{
		int result = 0;
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]+1 != a[i+1])
			{
				result = a[i]+1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<6; i+=2)
		{
			arr[i] = i;
		}
		System.out.println(missing(arr));
		sc.close();
	}

}
