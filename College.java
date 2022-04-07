package week3.day2;

public class College extends University {

	public static void main(String[] args) {
		
		College myCollege = new College();
		
		myCollege.pg();
		myCollege.ug();

	}

	@Override
	public void ug() {
		System.out.println("UG");
		
	}

}
