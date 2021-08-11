package step02;

import java.util.Scanner;

public class Quiz_09498 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int scope = scan.nextInt();
		
		if (scope >= 90) {
			System.out.println("A");
		} else if (scope >= 80) {
			System.out.println("B");
		} else if (scope >= 70) {
			System.out.println("C");
		} else if (scope >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		scan.close();

	}

}
