package step03;

import java.util.Scanner;

public class Quiz_10950 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int sum = 0;
		for (int j = 0; j < i; j++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum = num1 + num2;
			System.out.println(sum);
		}
		scan.close();
		
	}

}
