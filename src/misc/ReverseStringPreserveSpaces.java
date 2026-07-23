package misc;

public class ReverseStringPreserveSpaces {
	public static void main(String[] args) {
		String str="perfect  world";
		char[] ch=str.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j)
		{
			
			if(ch[i]==' ')
			{
				i++;
				continue;
			}
			
			if(ch[j]==' ')
			{
				j--;
				continue;
			}
			
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		System.out.println(ch);
			
	}
}
