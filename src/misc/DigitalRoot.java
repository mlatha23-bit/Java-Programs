package misc;

public class DigitalRoot {
	public static void main(String[] args) {
		int n=1234;
		while(n>=10)
		{
			int output=0;
			while(n>0)
			{
				int remainder=n%10;
				output=output+remainder;
				n=n/10;
			}
			n=output;
		}
	System.out.println("output "+n);	
	}
}
