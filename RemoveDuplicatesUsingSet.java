package week3.day2.assignment3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingSet {
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		Set<String> wordsSet = new LinkedHashSet<String>(); 
		String result =" ";
		for(String s: words)
		{
			wordsSet.add(s);
			
		}
		
		List<String> list = new ArrayList<String>();
		list.addAll(wordsSet);
		
			
		for(int i=0; i<list.size(); i++)
		{
			result = result + list.get(i)+" ";
					}
		System.out.println(result);
			
	}


}
