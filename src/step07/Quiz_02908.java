package step07;

import java.util.Scanner;

public class Quiz_02908 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 1.
		/*
		String num1 = scan.next();
		String num2 = scan.next();

		String num1_change = "";
		String num2_change = "";
		
		for (int i = num1.length() - 1; i >= 0; i--) {
			num1_change += String.valueOf(num1.charAt(i));
		}
		for (int i = num2.length() - 1; i >= 0; i--) {
			num2_change += String.valueOf(num2.charAt(i));
		}
		
		if (Integer.valueOf(num1_change) > Integer.valueOf(num2_change)) {
			System.out.println(num1_change);
		} else {
			System.out.println(num2_change);
		}
		*/
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		num1 = Integer.valueOf(new StringBuffer().append(num1).reverse().toString());
		num2 = Integer.valueOf(new StringBuffer().append(num2).reverse().toString());

		System.out.println((num1 > num2 ? num1 : num2));

		scan.close();
	}

}
