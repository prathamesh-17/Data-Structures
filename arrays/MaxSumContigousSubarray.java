package arrays;

/* find the sum of maximum element of each contigous subarray os size k
 * 
 * i/p : A = {2,3,4,5,6,7} k=3
 * o/p : 22
 * 
 * {2,3,4} = 4
 * {3,4,5} = 5
 * {4,5,6} = 6
 * {5,6,7} = 7
 * 4+5+6+7 = 22
 */
public class MaxSumContigousSubarray {

	static int sum(int a[],int n,int k)
	{
		int sum=0,max=0;
		for(int i=0; i<=n-k; i++)
		{
			max=0;
			for(int j=i; j<i+k; j++)
			{
				if(max<a[j])
				{
					max = a[j];
				}
			}
			sum+=max;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int a[] = {2,3,6,4,7,3,5,9,5,3,7,2,1,6,8};
		int n = 15,k=3;
		System.out.print(sum(a,n,k));

	}

}
