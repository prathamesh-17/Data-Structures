package arrays;


public class Leader {

	static void leader(int ar[])
	{
		for(int i=0; i<ar.length; i++)
		{
			int j;
			for(j=i+1; j<ar.length; j++)
			{
				if(ar[i]<=ar[j])
					break;
			}
			if(j==ar.length)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int a[] = {16,17,4, 3, 5, 2};
		leader(a);

	}

}
