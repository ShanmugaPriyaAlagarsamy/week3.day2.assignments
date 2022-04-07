package week3.day2.assignment1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	@Override
	public void ruby() {
		
		System.out.println("This is ruby method from multipleLanguage abstract class");
		
	}

	public void selenium() {
		
		System.out.println("This is selenium method from TestTool interface");
	}

	public void java() {

System.out.println("This is java method from language interface");		
	}

	public static void main(String args[])
	
	{
		
		// accessing all the interface and abstract class method using automation class
		
		Automation myAutomation = new Automation();
		
		myAutomation.java();
		myAutomation.selenium();
		myAutomation.python();
		myAutomation.ruby();
		
		// accessing the methods only in language interface - scope restriction
		
		Language myLanguage = new Automation();
		myLanguage.java();
		
		// accessing the methods only in abstract class
		
		MultipleLanguage myMulLanguage = new Automation();
		
		myMulLanguage.python();
		myMulLanguage.ruby();
		
	}
	
}
