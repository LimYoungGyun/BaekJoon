package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_02562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		
		int max = 0;
		int index = 0;
		int cnt = 0;
		
		for (int val : arr) {
			cnt++;
			if (val > max) {
				max = val;
				index = cnt;
			}
			
		}
		bw.write(max + "\n" + index);
		br.close();
		bw.flush();
		bw.close();
	}
}
