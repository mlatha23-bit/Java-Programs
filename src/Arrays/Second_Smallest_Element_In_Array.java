package Arrays;

public class Second_Smallest_Element_In_Array {
	
	public static void main(String[] args)
	{
	
	int[] num= {10,20,5,6,8,28,30};	
	int FirstSmallest=Integer.MAX_VALUE;
	int SecondSmallest=Integer.MAX_VALUE;
	
	for(int i:num)
	{
		if(i<FirstSmallest)
		{
			SecondSmallest=FirstSmallest;
			FirstSmallest=i;
		}
		else if(i<SecondSmallest && i!=FirstSmallest)
		{
			SecondSmallest=i;
		}
	}

	System.out.print("Second smallest element in an array: "+SecondSmallest);
	}

}
