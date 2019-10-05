package arrays;
import java.io.*;

public class LonelyInteger2 {
	
	public static void main(String[] args) {
		int c=0;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(",");
        int n = str.length;
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = Integer.parseInt(str[i]);
        }
        for(int i=0; i<n; i++)
        {
            c = c^a[i];
        }
        System.out.println(c);
        }
        catch(Exception e)
        {
            
        }

	}

}
