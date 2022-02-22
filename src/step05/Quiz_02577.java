package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_02577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num1 = Integer.valueOf(br.readLine());
		int num2 = Integer.valueOf(br.readLine());
		int num3 = Integer.valueOf(br.readLine());
		
		br.close();
		
		String value = String.valueOf(num1 * num2 * num3);
		String[] arr = {};
		arr = value.split("");
		
		int[] result = new int[10];
		for (int k = 0; k < 10; k++) {
			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				if (k == Integer.valueOf(arr[i])) {
					cnt++;
				}
			}
			result[k] = cnt;
		}
		
		for (int i = 0; i < result.length; i++) {
			bw.write(result[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
