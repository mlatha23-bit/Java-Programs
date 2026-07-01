package string;

public class PalindromeString {
	public static void main(String[] args)
	{
		String s="Madam";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		boolean isPalin=true;
		while(i<j)
		{
			if(ch[i]!=ch[j])
			{
				isPalin=false;
				break;
			}
			i++;
			j--;
		}
		if(isPalin)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
