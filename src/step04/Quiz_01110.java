package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_01110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		int value = N;
		int cnt = 0;
		
		while(true) {
			value = ((value % 10) * 10) + ((value / 10) + (value % 10)) % 10;
			cnt++;
			if (N == value) {
				break;
			}
		}
		br.close();
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
	}

}
