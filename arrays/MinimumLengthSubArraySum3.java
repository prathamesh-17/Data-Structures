package arrays;

public class MinimumLengthSubArraySum3 {
	
	static int minimumLength(int a[],int sum)
	{
		int result = Integer.MAX_VALUE;
		for(int i=0; i<a.length-1; i++)
		{
			int s = a[i];
			if(s>=sum)
			{
				result = 1;
				break;
			}
			for(int j=i+1; j<a.length; j++)
			{
				if(j-i>=result)
				{
					break;
				}
				s+=a[j];
				if(s>=sum)
				{
					result = Math.min(result,j-i+1);
					break;
				}
				
			}
			
		}
		return result==Integer.MAX_VALUE?0:result;
	}
	 
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,4,2};
        int k = 7;
        System.out.print(minimumLength(arr,k));
    }
            
}