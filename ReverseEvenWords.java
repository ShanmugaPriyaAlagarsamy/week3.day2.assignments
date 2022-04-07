package week3.day2.assignment2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String str = "I am a software tester";
		String[] words = str.split(" ");
		String result ="";
		
		for(int i=0; i<words.length; i++)
		{
			if(i%2 != 0)
			{
				String Str2= words[i];
				String revWord = "";
			char[] charArray = Str2.toCharArray();
			for(int j=charArray.length-1; j>=0; j--)
			{
				char c  = charArray[j];
				revWord = revWord + c;
				
			}
			
			result = result + revWord;
			}
			
			else
			{
				result = result + words[i];
			}
			
			if (i < words.length - 1) {
				result = result + " ";
			}
			
				}
		System.out.println(result);
		
			
			
		}
		
		
		
	
		

	}

