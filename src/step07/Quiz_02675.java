package step07;

import java.util.Scanner;

public class Quiz_02675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		
		for (int k = 0; k < cnt; k++) {
			int R = scan.nextInt(); // 입력된 반복 횟수
			String S = scan.next(); // 입력된 문자열
			
			for (int i = 0; i < S.length(); i++) {
				for (int j = 0; j < R; j++) {
					System.out.print(S.charAt(i));
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
