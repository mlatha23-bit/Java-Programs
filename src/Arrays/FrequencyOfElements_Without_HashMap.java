package Arrays;

import java.util.Arrays;

public class FrequencyOfElements_Without_HashMap {
	public static void main(String[] args)
	{
		int[] num= {1, 2, 2, 3, 1, 1};
		boolean[] visited=new boolean[num.length];
		
		
		for(int i=0;i<num.length;i++)
		{
			if(visited[i])
			{
				continue;
			}
			
			int count=1;
			
			for(int j=i+1;j<num.length;j++)
			{
			if(num[i]==num[j])
			{
				count++;
				visited[j]=true;
				
			}
			
			}
		System.out.println(num[i]+"-> "+count);
	}

}
}
