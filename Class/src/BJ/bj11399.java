package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj11399 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine()); //사람의 수
		
		int sum=0;
		
		int[] num=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			num[i]=Integer.parseInt(st.nextToken()); //돈을 인출하는데 걸리는 시간
		}
		
		Arrays.sort(num);
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				sum+=num[j];
			}
		}
		
		System.out.println(sum);
	}

}
