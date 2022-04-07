package week3.day2.assignment2;

public class FindTypes {
	
	public static void main(String[] args) {
		
		String str = "$$ Welcome to 2nd Class of Automation $$";
		int letter=0;
		int num=0;
		int space=0;
		int specialChar=0;
		
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		for(int i=0;i<charArray.length;i++)
		{
			if(Character.isAlphabetic(charArray[i]))
			{
				letter++;
			}
			
			else if(Character.isDigit(charArray[i]))
			{
				
				num++;
			}
			else if(Character.isSpaceChar(charArray[i]))
			{
				space++;
				
			}
			else 
			{
				specialChar++;
			}
		}
		
		System.out.println(letter);
		System.out.println(num);
		System.out.println(space);
		System.out.println(specialChar);

				
		
	}

}
