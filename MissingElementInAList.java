package week3.day2.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAList {
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(7);
		set.add(6);
		set.add(8);
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(set);		
		for(int i=1; i< list.size(); i++)
		{
			if(list.get(i-1)==i)
			{
				continue;
			}
			
			else {
				System.out.println("The missing element is: " + i);
				break;
			}	
			
		}
		
		
	}

}
