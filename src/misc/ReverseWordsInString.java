package misc;

public class ReverseWordsInString {
	
	public static void main(String[] args) {
		String s="I love India";
		String[] ch=s.split(" ");
		int i=0;
		int j=ch.length-1;
		while(i<j)
		{
			String temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		System.out.println(String.join(" ", ch));
	}

}
