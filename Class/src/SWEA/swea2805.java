package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea2805 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		for(int test_case=1;test_case<=T;test_case++) {
			int result=0;
			int N=Integer.parseInt(br.readLine());
			
			int[][] arr=new int[N][N];
			for(int i=0;i<N;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				String str=st.nextToken();
				for(int j=0;j<N;j++) {
					arr[i][j]=str.charAt(j)-'0';
					result+=arr[i][j];
				}
			}
			
			for(int i=0;i<N/2;i++) {
				for(int j=0;j<N/2-i;j++) {
					result-=(arr[i][j]+arr[N-1-i][j]+arr[i][N-1-j]+arr[N-1-i][N-1-j]);
				}
			}
			System.out.println("#"+test_case+" "+result);
		}
	}
}