package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Combining_List {
	public static void main(String[] args) {
		
	List<Integer> list1=Arrays.asList(1,2,3);
	List<Integer> list2=Arrays.asList(3,4,5,6);
	
	//Duplicates allowed
	List<Integer> combined=new ArrayList<>(list1);
	combined.addAll(list2);
	System.out.println("Combined Array List(with duplicates): "+combined);
		
	//Duplicates not allowed
	Set<Integer> combinedList=new LinkedHashSet<>(list1);
	combinedList.addAll(list2);
	System.out.println("Combined Array List(without duplicates): "+combinedList);
}
}