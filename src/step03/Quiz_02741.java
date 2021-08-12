package step03;

import java.util.Scanner;

public class Quiz_02741 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
		
		scan.close();

	}

}
