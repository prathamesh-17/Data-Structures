package arrays;

public class ArrayRightRotation {
	
	static void rotate(int a[],int d)
	{
		for(int i=0; i<d; i++)
		{
			rotateByOne(a,a.length);
		}
	}
	static public void rotateByOne(int a[],int n)
	{
		int temp,i;
		temp=a[n-1];
		for(i=n-1; i>0; i--)
		{
			a[i] = a[i-1];
		}
		a[i] = temp;
	}

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6},d=3;
		for(int n:ar)
		{
			System.out.print(n+" ");
		}
		System.out.print("\n");
		rotate(ar,d);
		for(int n:ar)
		{
			System.out.print(n+" ");
		}
	}

}
