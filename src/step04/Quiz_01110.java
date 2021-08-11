package step04;

import java.util.Scanner;

public class Quiz_01110 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		int f_number = number;
		
		int i = 1;
		
		if (number >= 0 && number <= 99) {
			
			while (true) {
				number = ((number % 10) * 10) + ((number / 10) + (number % 10)) % 10;
				
				if (f_number == number) {
					break;
				}
				i++;
			}

			System.out.println(i);
			
		}
		
		scan.close();

	}

}
