package step05;

import java.util.Scanner;

public class Quiz_02577 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		String result = (String.valueOf(num1 * num2 * num3));
		
		char[] arr = new char[10];

		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for (int j = 0; j < result.length(); j++) {
				if(i == result.charAt(j) - '0') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		scan.close();

	}

}
