package arrays;

/*
 * Given an array of positive integers. All numbers occur even number of times except one 
 * number which occurs odd number of times.
 * 
 * Input : arr = {1, 2, 3, 2, 3, 1, 3}
	Output : 3
 */
public class OddOccurencesOfanumber {

	static int oddcount(int a[])
	{
		for(int i=0 ;i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count%2 != 0)
			{
				return a[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = {1,2,2,2,2,3,3,1,3};
		System.out.print(oddcount(a));
	}

}
