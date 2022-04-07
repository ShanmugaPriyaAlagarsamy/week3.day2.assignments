package week3.day2.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestUsingList {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>();
		set.add(3);
		set.add(2);
		set.add(11);
		set.add(4);
		set.add(6);
		set.add(7);
		// set.add(1);
		System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(set);
		System.out.println(list);
		
		System.out.println("The Second largest value in the given number list is: " + list.get((list.size())-2));
		
	
		
	}
		

}
