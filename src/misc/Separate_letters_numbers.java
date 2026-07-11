package misc;

public class Separate_letters_numbers {
	
		public static void main(String[] args)
		{
			String s="A1B2C3D4";
			char[] ch=s.toCharArray();
			
			StringBuilder letter=new StringBuilder();
			StringBuilder number=new StringBuilder();
			
			for(char i:ch)
			{
				if(Character.isDigit(i))
					
				{
					number.append(i);
				}
				else if(Character.isLetter(i))
				{
					letter.append(i);
				}
			}
				System.out.println("Letters: "+letter);
				System.out.println("Numbers: "+number);
			
		}
	

}
