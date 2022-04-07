package week3.day2.assignment2;

import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "stops";
		String str2 = "potss";
		
		if(str1.length()==str2.length())
		{
			char[] charArray1 = str1.toCharArray();
			Arrays.sort(charArray1);
			
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray2);
			
			boolean flag = true;
			
			for (int i=0; i < charArray1.length; i++)
			{
				if(charArray1[i] == charArray2[i] )
				{
					continue;
				}
				else
				{
					flag = false;
					break;
				}
				
			}
		if(flag)	
		{
			System.out.println("The strings "+ str1 +","+ str2 + " are Anagram");
		}
		else
		{
			System.out.println("The strings "+ str1 +","+ str2 + " are not Anagram");
		}
			
			
		}
		else
		{
			System.out.println("The length of the strings are not same");
		}
	
	
	
	}
	
	}
