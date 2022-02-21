package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz_10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.valueOf(br.readLine());
		
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int i = 0;
		while (st.hasMoreTokens()) {
			arr[i] = Integer.valueOf(st.nextToken());
			i++;
		}
		
 		Arrays.sort(arr);
		
		bw.write(arr[0] + " " + arr[num - 1]);
		br.close();
		bw.flush();
		bw.close();
	}
}
