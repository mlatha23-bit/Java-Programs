package arrays;

public class Merge_arrays {
	public static void main(String[] args) {
		int[] arr1= {1,3,5};
		int[] arr2= {2,4,6};
		
		int[] result=new int[arr1.length+arr2.length];
		
		int i=0;
		int j=0;
		int z=0;
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				result[z]=arr1[i];
				i++;
			}
			else
			{
				result[z]=arr2[j];
				j++;
			}
			z++;
		}
		
		while(i<arr1.length)
		{
			result[z]=arr1[i];
			i++;
			z++;
		}
		while(j<arr2.length)
		{
			result[z]=arr2[j];
			j++;
			z++;
		}
		
		for(int num:result)
		{
			System.out.print(num+" ");
		}
}
}
