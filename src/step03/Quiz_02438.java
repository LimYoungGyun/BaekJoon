package step03;

import java.util.Scanner;

public class Quiz_02438 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for (int i = 0; i < number; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
