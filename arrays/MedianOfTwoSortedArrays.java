package arrays;

public class MedianOfTwoSortedArrays {

	static int median(int ar1[],int ar2[])
	{
		int i=0,j=0,m1=-1,m2=-1,count;
		int n=ar1.length;
		for(count=0; count<=n; count++)
		{
			if(i==n)
			{
				m1=m2;
				m2 = ar2[0];
				break;
			}
			else if(j==n)
			{
				m1=m2;
				m2=ar1[0];
				break;
			}
			if(ar1[i]<ar2[j])
			{
				m1 = m2;
				m2 = ar1[i];
				i++;
			}
			else
			{
				m1 = m2;
				m2 = ar2[j];
				j++;
			}
		}
		return (m1+m2)/2;
	}
	public static void main(String[] args) {
		int ar1[] = {1,5,6,7};
		int ar2[] = {15,16,18,19};
		System.out.print(median(ar1,ar2));

	}

}
