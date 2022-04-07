package week3.day2;

public class Desktop implements Hardware,Software {

	public void desktopModels()
	{
		
		System.out.println("These are available desktop models");
	}
	
	public void softwareResources() {
		
		System.out.println("These are available Software Resources");
	}


	public void hardwareResources() {
		
		System.out.println("These are available Hardware Resources");
		
	}
	
	
	public static void main(String[] args) {
		
		Desktop myDesktop = new Desktop();
		Software mydesktop2 = new Desktop();
		
		myDesktop.desktopModels();
		myDesktop.softwareResources();
		myDesktop.hardwareResources();
			

	}




}
