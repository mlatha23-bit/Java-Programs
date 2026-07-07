package string;

import java.util.Arrays;

public class ReverseWords {
	public static void main(String[] args) {
		String s="Java is a powerful programming language";
		String[] arr=s.split(" ");
		int i=0;
		int j=arr.length-1;
		
		while(i<j)
		{
			String temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(String.join(" ", arr));
	}

}
