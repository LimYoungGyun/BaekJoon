package step04;

import java.util.Scanner;

public class Quiz_10951 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextInt()) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			System.out.println(num1 + num2);
		}
		
		scan.close();

	}

}
