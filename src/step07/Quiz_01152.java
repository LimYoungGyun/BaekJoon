package step07;

import java.util.Scanner;

public class Quiz_01152 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String words = scan.nextLine();
		words = words.trim();
		
		if (words.isEmpty()) {
			System.out.println("0");
		} else {
			String result[] = words.split(" ");
			System.out.println(result.length);
		}
		scan.close();
	}

}
