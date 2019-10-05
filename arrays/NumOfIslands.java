package arrays;

public class NumOfIslands {
	
	static boolean isSafe(int M[][],int row,int col,boolean visited[][])
	{
		return (row>=0) && (row<ROW) && (col>=0) && (col<COL) && (M[row][col]==1 && !visited[row][col]); 
	}
	
	static void dfs(int M[][],int row,int col,boolean visited[][])
	{
		int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 }; 
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 }; 
  
        // Mark this cell as visited 
        visited[row][col] = true; 
  
        // Recur for all connected neighbours 
        for (int k = 0; k < 8; ++k) 
            if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited)) 
                dfs(M, row + rowNbr[k], col + colNbr[k], visited);
	}
	static final int ROW=5,COL=5;
	static int count(int[][] M)
	{
		boolean visited[][] = new boolean[ROW][COL];
		int count=0;
		for(int i=0; i<ROW; ++i)
		{
			for(int j=0; j<COL; ++j)
			{
				if(M[i][j] == 1 && !visited[i][j])
				{
					dfs(M,i,j,visited);
					++count;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int M[][] = {{ 1, 1, 0, 0, 0 }, 
                	{ 0, 1, 0, 0, 1 }, 
                	{ 1, 0, 0, 1, 1 }, 
                	{ 0, 0, 0, 0, 0 }, 
                	{ 1, 0, 0, 1, 1 } }; 
		System.out.print(count(M));

	}

}
