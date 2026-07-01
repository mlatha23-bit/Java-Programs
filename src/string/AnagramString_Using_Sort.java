package string;

import java.util.Arrays;

public class AnagramString_Using_Sort {
	public static void main(String[] args)
	{
		String s="Listen";
		s=s.toLowerCase();
		String t="Silent";
		t=t.toLowerCase();
		
		char[] s1=s.toCharArray();
		char[] t1=t.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		if(Arrays.equals(s1, t1))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
