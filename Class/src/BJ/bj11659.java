package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj11659 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int N=Integer.parseInt(s[0]);
		int M=Integer.parseInt(s[1]);
		
		int[] num=new int[N+1];
		num[0]=0;
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			num[i]=num[i-1]+Integer.parseInt(st.nextToken());
		}
		
		for(int k=0;k<M;k++) {
			st=new StringTokenizer(br.readLine());
			int i=Integer.parseInt(st.nextToken());
			int j=Integer.parseInt(st.nextToken());
			
			int result=num[j]-num[i-1];
			System.out.println(result);
		}
	}
}