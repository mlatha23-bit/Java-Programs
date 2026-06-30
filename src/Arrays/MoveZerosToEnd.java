package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args)
	{
	int[] num= {0, 5, 0, 2, 8, 0, 1};
	int index=0;
	for(int i=0;i<num.length;i++)
	{
		if(num[i]!=0)
		{
			num[index]=num[i];
			index++;
		}
	}
	
	while(index<num.length)
	{
		num[index]=0;
		index++;
	}
	System.out.println(Arrays.toString(num));
}
}

