package step01;

import java.util.Scanner;

public class Quiz_10430 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A, B, C;
		int result;
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		result = (A+B)%C;
		System.out.println(result);
		result = ((A%C) + (B%C))%C;
		System.out.println(result);
		result = (A*B)%C;
		System.out.println(result);
		result = ((A%C) * (B%C))%C;
		System.out.println(result);
		
		scan.close();

	}

}
