package string;

public class CountVowelsConsonants {
	public static void main(String[] args)
	{
		String s="Automation";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		int vcount=0;
		int ccount=0;
	
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		System.out.println("Vowels"+" "+vcount);
		System.out.println("Consonants"+" "+ccount);
		}
			
	}

