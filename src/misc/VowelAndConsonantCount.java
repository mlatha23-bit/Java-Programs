package misc;

public class VowelAndConsonantCount {
	public static void main(String[] args) {
		String s="Hello";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		
		int vcount=0;
		int ccount=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i] >= 'a' && ch[i] <= 'z') 
			{
			if(ch[i]=='a' ||ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u' )
			{
				vcount+=1;
			}
			else
			{
				ccount+=1;
			}
			}
		}
		System.out.println("Vowels count = "+vcount);
		System.out.println("Consonant count = "+ccount);
}

}
