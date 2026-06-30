package Arrays;

import java.util.HashSet;

public class DuplicateElements_HashSet {
	public static void main(String[] args)
	{
		int[] num={2, 4, 6, 2, 5, 5, 8, 4};
		HashSet<Integer> seen=new HashSet<>();
		HashSet<Integer> duplicate=new HashSet<>();
		for(int i:num)
		{
			if(!seen.add(i))
			{
				duplicate.add(i);
			}
		}
		if(duplicate.isEmpty())
			
		{
			System.out.println("No Duplicate Elements Found");
		}
		
		else
			
		{
			System.out.println("Duplicate Elements = "+duplicate);
		}
	}

}
