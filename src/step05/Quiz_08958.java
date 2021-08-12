package step05;

import java.util.Scanner;

public class Quiz_08958 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		
		String[] quiz = new String[number];
		for (int i = 0; i < quiz.length; i++) {
			quiz[i] = scan.next();
		}
		
		for (int i = 0; i < quiz.length; i++) {
			String select_quiz = quiz[i];
			String select_quiz_test[] = select_quiz.split("");
			
			int sum = 0;
			int cnt = 0;
			
			for (int j = 0; j < select_quiz_test.length; j++) {
				if (select_quiz_test[j].equals("O")) {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
					sum += cnt;
				}
			}
			System.out.println(sum);
		}
		
		scan.close();

	}

}
