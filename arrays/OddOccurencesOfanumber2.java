package arrays;
import java.util.*; 
/*
 * Given an array of positive integers. All numbers occur even number of times except one 
 * number which occurs odd number of times.
 * 
 * Input : arr = {1, 2, 3, 2, 3, 1, 3}
	Output : 3
 */
public class OddOccurencesOfanumber2 {

	static int oddcount(int a[])
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<a.length; i++)
		{
			if(map.containsKey(a[i]))
			{
				int value = map.get(a[i]);
				map.put(a[i], value+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		for(Integer x:map.keySet())
		{
			if(map.get(x)%2 == 0)
				return x;
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = {1,2,4,3,4,3,2,7,8,7,7,8,4,3,2,3,1,3,1};
		System.out.print(oddcount(a));
	}

}
