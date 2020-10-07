import java.util.Scanner;

public class Part_two {
	static void grading(int x) {
		int grade = x/10;
		switch(grade) {
			case 1:
				System.out.println("you got a " + x + " which is an F");
				break;
			case 2:
				System.out.println("you got a " + x + " which is an F");
				break;
			case 3:
				System.out.println("you got a " + x + " which is an F");
				break;
			case 4:
				System.out.println("you got a " + x + " which is an F");
				break;
			
			case 5:
				System.out.println("you got a " + x + " which is an F");
				break;
			
			case 6:
				System.out.println("you got a " + x + " which is a D");
				break;
			
			case 7:
				System.out.println("you got a " + x + " which is an C");
				break;

			case 8:
				System.out.println("you got a " + x + " which is a B");
				break;

			case 9:
				System.out.println("you got a " + x + " which is an  A");
				break;

			default:
				System.out.println("Error");
				break;
		}
}
	public static void main (String[] args) {

		grading(93);
	}

}