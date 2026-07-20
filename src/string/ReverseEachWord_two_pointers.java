package string;

public class ReverseEachWord_two_pointers {
	public static void main(String[] args) {
		String s=" Java Selenium Automation";
		String[] str=s.split(" ");
		StringBuilder result=new StringBuilder();
		for(String i:str)
		{
			char[] ch=i.toCharArray();
			int a=0;
			int b=ch.length-1;
			while(a<b)
			{
				char temp=ch[a];
				ch[a]=ch[b];
				ch[b]=temp;
				a++;
				b--;
			}
			result.append(ch).append(" ");
			
		}
		System.out.println(result.toString().trim());
}
}
