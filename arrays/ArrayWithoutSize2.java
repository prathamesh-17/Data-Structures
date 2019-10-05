package arrays;

import java.io.*;

public class ArrayWithoutSize2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String str[] = br.readLine().split(" ");
			int n = str.length;
			int a[] = new int[n];
			for(int i=0; i<n; i++)
			{
				a[i] = Integer.parseInt(str[i]);
			}
			for(int x:a)
			{
				System.out.print(x+" ");
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
