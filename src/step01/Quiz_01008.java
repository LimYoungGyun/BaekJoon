package step01;

import java.util.Scanner;

public class Quiz_01008 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a, b;
		double result;
		a = scan.nextInt();
		b = scan.nextInt();
		result = a / (double)b;
		System.out.println(result);

	}

}
