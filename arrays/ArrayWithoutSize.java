package arrays;

import java.util.*;

public class ArrayWithoutSize {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int input = sc.nextInt();
			if(input < 0)
				break;
			list.add(input);
		}
		System.out.print(list);

		sc.close();
	}

}
