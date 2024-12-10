package step006;

import java.util.Scanner;

/**
 * @author : lim
 * @description : "package" 라인 제외, 출제 번호를 Main으로 변경 후 제출. (채점이 진행되지 않음)
 * @since : 24. 12. 11.(수) 00:38
 */
public class Q2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			// 앞쪽 공백
			for (int j = 0; j < N - (i + 1); j++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = N - 1; i > 0; i--) {
			// 앞쪽 공백
			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
