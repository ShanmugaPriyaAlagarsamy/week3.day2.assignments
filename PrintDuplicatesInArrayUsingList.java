package week3.day2.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArrayUsingList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		
	   Collections.sort(list);
	   System.out.println("The given list is: " + list);
	   
	   List<Integer> list2 = new ArrayList<Integer>();
	   
	   for(int i=0; i<list.size()-1; i++)
	   {
		   if(list.get(i)== list.get(i+1))
			   		   {
			   list2.add(list.get(i));
			   
		   }
		   
	   }
	   System.out.print("Duplicate numbers in the list are:" + list2);
		
			}

}
