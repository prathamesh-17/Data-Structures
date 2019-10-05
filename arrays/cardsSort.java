package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class cardsSort {

	public static void main(String[] args) {
		int a[] = new int[8];
		int c[] = new int[8];
		int d[] = new int[8];
		int m=0, n=0, o=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<8; i++)
		{
			String str = sc.next();
			if(str.charAt(0) == 'A' || str.charAt(0) == 'a')
			{
				char num = str.charAt(1);
				a[m] = Character.getNumericValue(num);
				m++;
			}
			else if(str.charAt(0) == 'C' || str.charAt(0) == 'c')
			{
				if(str.charAt(1) == 'J')
				{
					c[n] = 10;
					n++;
				}
				else if(str.charAt(1) == 'A')
				{
					c[n] = 11;
					n++;
				}
				else if(str.charAt(1) == 'Q')
				{
					c[n] = 12;
					n++;
				}
				else if(str.charAt(1) == 'K')
				{
					c[n] = 13;
					n++;
				}
				else
				{
					char num = str.charAt(1);
					c[n] = Character.getNumericValue(num);
					n++;
				}
				
			}
			else if(str.charAt(0) == 'D' || str.charAt(0) == 'd')
			{
				char num = str.charAt(1);
				d[o] = Character.getNumericValue(num);
				o++;
			}
		}
		Arrays.sort(a);
		for(int x:a)
		{
			if(x != 0)
			{
				System.out.print("a"+x+" ");
			}
			
		}
		System.out.print("\n");
		Arrays.sort(c);
		for(int x:c)
		{
			if(x != 0)
			{
			System.out.print("c"+x+" ");
			}
		}
		System.out.print("\n");
		Arrays.sort(d);
		for(int x:d)
		{
			if(x != 0)
			{
			System.out.print("d"+x+" ");
			}
		}
		sc.close();
	}

}
