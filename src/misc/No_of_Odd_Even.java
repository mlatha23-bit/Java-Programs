package misc;

public class No_of_Odd_Even {
	public static void main(String[] args) {
		
		int[] n= {10, 15, 20, 25, 30};
		int ec=0;
		int oc=0;
		
		for(int i:n)
		{
			if(i%2==0)
			{
				ec++;
			}
			else
			{
				oc++;
			}
		}
		System.out.println("No of Even numbers: "+ec);
		System.out.println("No of Odd numbers: "+oc);
	}

}
