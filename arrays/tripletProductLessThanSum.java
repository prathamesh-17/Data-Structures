package arrays;

public class tripletProductLessThanSum {
	
	static int count(int a[],int sum)
	{
		int c=0;
		for(int i=0; i<a.length-2; i++)
		{
			for(int j=i+1; j<a.length-1; j++)
			{
				for(int k=j+1; k<a.length; k++)
				{
					if(a[i]+a[j]+a[k] < sum)
					{
						c++;
					}
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int a[] = {-2, 0, 1, 3},target=2;
		
		System.out.print(count(a,target));
		

	}

}
