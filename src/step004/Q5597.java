package step004;

import java.util.Scanner;

/**
 * @author : lim
 * @description : "package" 라인 제외, 출제 번호를 Main으로 변경 후 제출. (채점이 진행되지 않음)
 * @since : 24. 12. 10.(화) 13:25
 */
public class Q5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[30];
		for (int i = 0; i < 28; i++) {
			int n = sc.nextInt();

			arr[n-1] = 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println(i + 1);
			}
		}
	}
}
