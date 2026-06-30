package Arrays;

public class CheckSortedArray {
	public static void main(String[] args)
	{
		 int[] num= {5,10,15,20};
		 boolean isSorted=true;
		 for(int i=0;i<num.length-1;i++)
		 {
			 if(num[i]>num[i+1])
			 {
				 isSorted=false;
				 break;
			 }
		 }
		 
		 if(isSorted)
		 {
			 System.out.print("Array is sorted");
		 }
		 else
		 {
			 System.out.print("Array is not sorted");
		 }
	}
}
