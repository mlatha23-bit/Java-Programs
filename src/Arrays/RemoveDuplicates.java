package Arrays;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args)
	{
		int[] num={2, 4, 6, 2, 5, 5, 8, 4};
		HashSet<Integer> unique=new HashSet<>();
	
		for(int i:num)
		{
			unique.add(i);
			
		}
		System.out.println("Array after removing duplicates: "+ unique);
	}

}
