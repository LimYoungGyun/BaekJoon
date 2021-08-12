package step05;

import java.util.Scanner;

public class Quiz_04344 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int testCaseNumber = scan.nextInt();
		int testCase[] = new int[testCaseNumber];
		int scoreCnt = 0;
		
		for (int i = 0; i < testCase.length; i++) {
			scoreCnt = scan.nextInt();
			int indiScore[] = new int[scoreCnt];
			
			for (int j = 0; j < indiScore.length; j++) {
				indiScore[j] = scan.nextInt();
			}
			
			int sum = 0;
			double avg = 0.0;
			
			for (int j = 0; j < indiScore.length; j++) {
				sum += indiScore[j];
			}
			avg = sum / (double) scoreCnt;
			
			int cnt = 0;
			for (int j = 0; j < indiScore.length; j++) {
				
				if (indiScore[j] > avg) {
					cnt++;
				}
			}
			
			avg = 0.0;
			avg = (double)cnt / scoreCnt;
			System.out.println(String.format("%,.3f", avg * 100) + "%");
		}

		scan.close();

	}

}
