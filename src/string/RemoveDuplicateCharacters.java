package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
	public static void main(String[] args)
	{
		String s="Programming";
		char[] ch=s.toCharArray();
		Set<Character> unique=new LinkedHashSet<>();
		for(char i:ch)
		{
			unique.add(i);
		}
		StringBuilder result=new StringBuilder();
		for(char c:unique)
		{
			result.append(c);
		}
		System.out.println(result.toString());
	}

}
