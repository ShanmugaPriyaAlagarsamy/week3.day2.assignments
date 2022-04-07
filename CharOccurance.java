package week3.day2.assignment2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int count = 0; 
	char[] charArray = str.toCharArray();
		
		for(int i=0; i< charArray.length; i++)
		{
			if(charArray[i]=='e')
			{
				count ++;
			}
			
		}
		if(count!=0)
		{
		System.out.println("The letter 'e' is occuring " + count + " times in the string "+ str );
	}
		else
		{
		System.out.println("The letter 'e' is not occuring in the string " + str);	
		}

	}
	

}
