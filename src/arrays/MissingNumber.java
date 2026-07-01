package arrays;

public class MissingNumber {
	public static void main(String[] args)
	{
		int[] num= {1, 2, 3, 8};
		int n=8;
		System.out.print("Missing numbers in array:  ");
		for(int i=1;i<=n;i++)
		{
			boolean found=false;
			for(int j:num)
			{
				if(j==i)
			{
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.print(i+", ");
			
		}
		}
		
	}

}

