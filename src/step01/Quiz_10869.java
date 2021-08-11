package step01;

import java.util.Scanner;

public class Quiz_10869 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a, b;
		int result;
		a = scan.nextInt();
		b = scan.nextInt();
		result = a + b;
		System.out.println(result);
		result = a - b;
		System.out.println(result);
		result = a * b;
		System.out.println(result);
		result = a / b;
		System.out.println(result);
		result = a % b;
		System.out.println(result);
		
		scan.close();

	}

}
