package string;

public class AnagramString_Without_Sort {
	public static void main(String[] args)
	{
		String s="Listen";
		s=s.toLowerCase();
		
		String t="Silent";
		t=t.toLowerCase();
		
		
		
		boolean isAnagram=true;
		
		if(s.length()!=t.length())
		{
			System.out.println("Not Anagram");
			return;
		}
		
		int[] counter=new int[26];
		
		for(int i=0;i<s.length();i++)
		{
		 counter[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<t.length();i++)
		{
		 counter[t.charAt(i)-'a']--;
		 if(counter[t.charAt(i)-'a']<0)
		 {
			 isAnagram=false;
			 break;
		 }
		}
		
		if (isAnagram) {
		    for (int count : counter) {
		        if (count != 0) {
		            isAnagram = false;
		            break;
		        }
		    }
		}
		if(isAnagram)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
