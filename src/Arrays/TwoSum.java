package Arrays;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args)
	{
		 int[] arr = {2, 7, 11, 15};
	        int target = 9;
	        HashMap<Integer,Integer> map=new HashMap<>();
	        
	        for(int i=0;i<arr.length;i++)
	        {
	        	int num=target-arr[i];
	        	if(map.containsKey(num))
	        	{
	        		System.out.println("Pair Found: "+arr[i]+" + "+num+" = "+target);
	        		return;
	        	}
	        	map.put(arr[i], i);
	        }
	        System.out.println("No Pair Found");
	}

}
