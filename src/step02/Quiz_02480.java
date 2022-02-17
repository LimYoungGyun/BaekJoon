package step02;

import java.util.Scanner;

public class Quiz_02480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		scan.close();
		
		int highNum = Math.max(num[0], Math.max(num[1], num[2]));
		
		if (num[0] == num[1] && num[1] == num[2]) {
			System.out.println(10000 + num[0] * 1000);
		} else if (num[0] == num[1] || num[0] == num[2]) {
			System.out.println(1000 + num[0] * 100);
		} else if (num[1] == num[2]) {
			System.out.println(1000 + num[1] * 100);
		} else {
			System.out.println(highNum * 100);
		}
	}
}
