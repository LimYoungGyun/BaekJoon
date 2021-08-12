package step05;

import java.util.Scanner;

public class Quiz_01546 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		int[] score = new int[number];
		
		for (int i = 0; i < number; i++) {
			score[i] = scan.nextInt();
		}
		
		int max = score[0];
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		
		double sum = 0.0;
		for (int i = 0; i < score.length; i++) {
			sum += Double.valueOf(score[i]) / max * 100;
		}

		double avg = 0.0;
		for (int i = 0; i < score.length; i++) {
			avg = sum / number;
		}
		System.out.println(avg);
		
		
		scan.close();

	}

}
