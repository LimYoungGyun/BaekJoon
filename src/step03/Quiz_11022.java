package step03;

import java.util.Scanner;

public class Quiz_11022 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result = 0;
		
		for (int i = 1; i <= number; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			result = num1 + num2;
			
			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + result);
		}
		
		scan.close();

	}

}
