package misc;

public class TwoSumIndices {
	public static void main(String[] args) {
		int[] num= {5, 12, 7, 10, 8, 9};
		int target=17;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==target)
				{
					System.out.println("Indices["+i+","+j+"]");
				}
			}
		}
		
	}
}
