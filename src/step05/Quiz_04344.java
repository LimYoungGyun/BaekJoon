package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_04344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int C = Integer.valueOf(br.readLine());
		
		for (int i = 0; i < C; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.valueOf(st.nextToken());
			int[] arr = new int[N];
			
			double sum = 0;
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.valueOf(st.nextToken());
				sum += arr[j];
			}
			
			double avg = sum / N;
			double cnt = 0.0;
			
			for (int j = 0; j < N; j++) {
				if (arr[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", (cnt / N) * 100);
		}
	}

}
