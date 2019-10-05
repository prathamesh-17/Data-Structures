package arrays;

public class LonelyInteger {

	static int countLonely(int a[])
	{
		int c=0;
		for(int i=0; i<a.length; i++)
		{
			c ^= a[i];
		}
		return c;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,3,2,1,2,1,3,5,6,7,7,6};
		System.out.print(countLonely(a));

	}

}
