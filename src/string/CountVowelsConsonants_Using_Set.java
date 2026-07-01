package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsConsonants_Using_Set {
	public static void main(String[] args)
	{
		String s="ABcd";
		s=s.toLowerCase();
		Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u'));
		
		int vcount=0;
		int ccount=0;
		
		for(char ch:s.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				if(vowels.contains(ch))
				{
					vcount++;
				}
				else
				{
					ccount++;
				}
			}
		}
		System.out.println("Vowels: "+vcount);
		System.out.println("Consonants: "+ccount);
	}
	
}
