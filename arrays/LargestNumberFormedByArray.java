package arrays;
import java.util.*;
public class LargestNumberFormedByArray {

	static void printLargest(int a[])
	{
		String[] ar = new String[a.length];
		for(int i=0; i<a.length;i++)
		{
			ar[i] = String.valueOf(a[i]);
		}
		
		Arrays.sort(ar,new Comparator<String>() {
			public int compare(String a,String b)
			{
				return (b+a).compareTo(a+b);
			}
		});
		
		
		StringBuilder sb = new StringBuilder();
		for(String s:ar)
		{
			sb.append(s);
		}
		System.out.print(sb.toString());
		
	}
	
	public static void main(String[] args) {
		int a[] = {3, 30, 34, 5, 9};
		printLargest(a);
	}

}
