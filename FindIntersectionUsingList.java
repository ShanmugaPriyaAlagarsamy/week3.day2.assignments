package week3.day2.assignment3;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		
		List<Integer> list3 = new ArrayList<Integer>();
		
		for(int i=0; i<list1.size(); i++)
		{
			for(int j=0; j<list2.size();j++)
			{
				if(list1.get(i)==list2.get(j))
				{
					list3.add(list1.get(i));
					
				}
				
			}
			
		}
		System.out.println(list3);
		
		
	}

}
