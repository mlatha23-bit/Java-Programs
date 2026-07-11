package misc;

public class Natural_numbers {
	public static void main(String[] args)
	{
		natural(5);
	}
		
		public static void natural(int n)
		{
			//Defining base case
			
			if(n==1)
			{
				System.out.println(1);
			}
			
			//Recursive case
			else
			{
				System.out.println(n);
				natural(n-1);
			}
			
		}

}
