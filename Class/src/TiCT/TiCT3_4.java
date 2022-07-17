package TiCT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TiCT3_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()); 
		int K=Integer.parseInt(st.nextToken()); 
		
		int[] num=new int[N+1];
		num[1]=0;
		for(int i=2;i<=N;i++) {
			num[i]=num[i-1]+1;
			if(i%K==0) num[i]=Math.min(num[i], num[i/K]+1);
		}
		System.out.print(num[N]);
	}

}
