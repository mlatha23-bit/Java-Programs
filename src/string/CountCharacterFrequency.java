package string;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequency {
	
	public static void main(String[] args)
	{
		String s="banana";
		s=s.toLowerCase();
		
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.print(entry.getKey()+"->"+entry.getValue()+" ");
		}
	}

}
