package Arrays;

public class DuplicateElements_NestedLoop {
	public static void main(String[] args)
	{
		int[] num={2, 4, 6, 2, 8,5,7,5, 4};
		boolean found=false;
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
			if(num[i]==num[j])
			{
				System.out.println(num[i]+" ");
				found=true;
				break;
			}
		}
		
	}
		if(!found)
		{
			System.out.println("None");
		}
	}
	

}
