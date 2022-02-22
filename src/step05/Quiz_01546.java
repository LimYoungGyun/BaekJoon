package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz_01546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.valueOf(br.readLine());
		
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		double[] result = new double[num];
		for (int i = 0; i < result.length; i++) {
			result[i] = arr[i] / (double)max * 100;
		}
		
		double sum = 0;
		for (int i = 0; i < result.length; i++) {
			sum += result[i];
		}
		
		double avg = sum / num;
		
		bw.write(avg + "\n");
		bw.flush();
		bw.close();
	}

}
