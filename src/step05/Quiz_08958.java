package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_08958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int num = Integer.valueOf(br.readLine());
		
		String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		for (int i = 0; i < num; i++) {
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
//			bw.write(sum + "\n");
			sb.append(sum).append("\n");
		}
		
		// bw.flush();
		// bw.close();
		System.out.println(sb);
	}

}
