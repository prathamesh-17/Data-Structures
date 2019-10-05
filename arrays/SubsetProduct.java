package arrays;

public class SubsetProduct {
	
	static int product(int a[],int k)
	{
		int count = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] < k)
			{
				count++;
			}
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] * a[j] <= k)
				{
					count++;
				}
			}

		}
		return count;
		
	}	
	public static void main(String args[])
	{
		int a[] = {2, 4, 5, 3};
		int k = 12;
		System.out.print(product(a,k));
	}
}


