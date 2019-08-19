package linkedLists;
import java.util.Scanner;
class Rotation
{
    boolean rotate(int[][] matrix)
    {
        if(matrix.length == 0 || matrix.length != matrix[0].length)
            return false;
        int n = matrix.length;
        for(int layer=0; layer<n/2; layer++)
        {
            int first=layer;
            int last=n-1-layer;
            for(int i=first; i<last; i++)
            {
                int offset = i-first;
                int top=matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first]=matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }
    
}

public class Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        Rotation r = new Rotation();
        r.rotate(a);
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                System.out.println(a[i][j]);
            }
        }
      sc.close();
	}

}
