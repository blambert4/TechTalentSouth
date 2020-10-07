import java.util.Scanner;

public class Part_one {
	static void grading(int x) {
		if (x >= 90 && x <=100) {
			System.out.printf("you got a " + x + " which is an A \n");
		}
		else if (x >=80 && x < 90) {
			System.out.printf("you got a "+ x +" which is a B \n");
		}
		else if (x >= 70 && x < 80) {
			System.out.printf("you got a "+ x +" which is a C \n");
		}
		else if (x >=60 && x < 70) {
			System.out.printf("you got a "+ x +" which is a D \n");
		}
		else if (x >= 0 && x < 59) {
			System.out.printf("you got a "+ x +" which is an F \n");
		}
		else {
			System.out.println("error");
		}
	}

	public static void main (String[] args) {

		grading(93);
	}

}