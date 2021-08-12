package step03;

import java.util.Scanner;

public class Quiz_02739 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
		
		scan.close();

	}

}
