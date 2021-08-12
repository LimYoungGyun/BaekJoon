package step05;

import java.util.Scanner;

public class Quiz_02562 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] number = new int[9];

		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
		}

		int max = 0;
		int index = 0;
		for (int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
				index = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(index);

		scan.close();

	}

}
