package step004;

import java.util.Scanner;

/**
 * @author : lim
 * @description : "package" 라인 제외, 출제 번호를 Main으로 변경 후 제출. (채점이 진행되지 않음)
 * @since : 24. 12. 10.(화) 13:25
 */
public class Q10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		for (int k = 0; k < M; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			int temp = arr[j-1];
			arr[j-1] = arr[i-1];
			arr[i-1] = temp;
		}

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}