package arrays;

class ArrayMinMax 
{
	public static void main(String[] args)
	{
		int[] num= {12, 45, 7, 89, 23};
		int Largest_Element=Integer.MIN_VALUE;
		int Smallest_Element=Integer.MAX_VALUE;
		for(int i:num)
		{
			if(i>Largest_Element)
			{
				Largest_Element=i;
			}
			
			if(i<Smallest_Element)
			{
				Smallest_Element=i;
			}
		}
		
		System.out.println("Largest Element= "+Largest_Element);
		System.out.println("Smallest Element= "+Smallest_Element);
	
	}
}
