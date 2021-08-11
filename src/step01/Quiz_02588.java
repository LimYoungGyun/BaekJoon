package step01;

import java.util.Scanner;

public class Quiz_02588 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		int _num1 = (number2 % 10); // 일의 자리
		int _num2 = (number2 % 100) / 10; // 십의 자리
		int _num3 = (number2 / 100); // 백의 자리
		
		int number3 = number1 * _num1;
		int number4 = (number1 * _num2);
		int number5 = (number1 * _num3);
		
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println((number3)+(number4*10)+(number5*100));

	}

}
