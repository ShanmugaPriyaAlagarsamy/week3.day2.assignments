package week3.day2.assignment2;

public class Palindrome {
	
	public static void main(String args[])
	
	{
		
		String str = "madam";
		String revStr = "";
	
		for(int i=str.length()-1; i>=0; i--)
		{
			Character strChar = str.charAt(i);
			revStr = revStr + strChar;
		
		}
		
		System.out.println(revStr);
		
		if(revStr.equalsIgnoreCase(str))
		{
			System.out.println("The String "+ str + " is Palindrome");
					}
		else
		{
			System.out.println("The String "+ str + " is not a Palindrome");
		}
		
	}

}
