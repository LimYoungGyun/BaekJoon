package step004;

import java.util.Scanner;

/**
 * @author : lim
 * @description : "package" 라인 제외, 출제 번호를 Main으로 변경 후 제출. (채점이 진행되지 않음)
 * @since : 24. 12. 10.(화) 17:05
 */
public class Q10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 바구니 수
		int M = sc.nextInt(); // 반복문 수

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		for (int k = 1; k <= M; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			int[] temp = arr.clone();
			int z = j;
			for (int s = i; s <= j; s++) {
				arr[s - 1] = temp[z - 1];
				z--;
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
