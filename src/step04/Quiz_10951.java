package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz_10951 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		String value;
		
		/**
		 * "BufferedReader"의 경우에는 EOF를 던져주어야 하기 대문에
		 * ctrl + Z (윈도우)혹은 ctrl + D(리눅스)를 입력해야한다.
		 */
		while ((value = br.readLine()) != null) {
			st = new StringTokenizer(value, " ");
			bw.write(Integer.valueOf(st.nextToken()) + Integer.valueOf(st.nextToken()) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
