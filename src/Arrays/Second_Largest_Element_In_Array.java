package Arrays;

public class Second_Largest_Element_In_Array {
	
	public static void main(String[] args)
	{
	
	int[] num= {10,20,5,8,28,30};	
	int FirstLargest=Integer.MIN_VALUE;
	int SecondLargest=Integer.MIN_VALUE;
	
	for(int i:num)
	{
		if(i>FirstLargest)
		{
			SecondLargest=FirstLargest;
			FirstLargest=i;
		}
		else if(i>SecondLargest && i!=FirstLargest)
		{
			SecondLargest=i;
		}
	}

	System.out.print("Second largest element in an array: "+SecondLargest);
	}

}
