package misc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class replaceString {
	public static void main(String[] args)
	{
		String input="C:\\Users\\kisho\\Desktop\\demo\\old.txt"; //Stores the full path of the input file (old.txt).
		String output="C:\\Users\\kisho\\Desktop\\demo\\new.txt"; //Stores the full path of the output file (new.txt).
		
		try(BufferedReader reader=new BufferedReader(new FileReader(input)); //Opens the input file for reading using a buffered reader.
				BufferedWriter writer=new BufferedWriter(new FileWriter(output))){ //Opens the output file for writing using a buffered writer.
			
			String line;  //Declares a variable to hold each line read from the file.
			
			while((line=reader.readLine())!=null) //Reads each line until the end of the file (null means no more lines).
			{
				if(line.contains("20207899")) //Checks if the current line contains the text "20207899"
				{
					line=line.replace("20207899", "20217966"); //Replaces "20207899" with "20217966" in that line.
				}
				writer.write(line); //Writes the (possibly modified) line into the output file.
				writer.newLine();  //Adds a newline after writing the line.
			} 
			 System.out.println("File processed successfully. Check " + output); //Prints a success message with the output file path.
			
		}
		catch(IOException e){ //Catches any input/output errors that occur during reading/writing.
			  e.printStackTrace(); //Prints the error details if an exception happens.
			
		}
	}

}
