package string;

public class LongestWord {
public static void main(String[] args)
{
	String s="Java is a powerful programming language";
	String[] arr=s.split(" ");
	String longest="";
	for(String word:arr)
	{
		if(word.length()>longest.length())
		{
			longest=word;
			
		}
	}
	System.out.print("Longest Word: "+longest);

}
}
