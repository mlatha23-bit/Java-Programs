package string;

public class ReverseEachWord {
		public static void main(String[] args) {
		String s="Java Selenium Automation";
		String[] str=s.split(" ");
		StringBuilder result=new StringBuilder();
		for(String i:str)
		{
			for(int j=i.length()-1;j>=0;j--)
			{
				result.append(i.charAt(j));
			}
			result.append(" ");
		}
		  System.out.println(result.toString().trim());
}

}
