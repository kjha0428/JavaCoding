package TiCT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TiCT_A05 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int N=Integer.parseInt(str[0]);
		int M=Integer.parseInt(str[1]);
		
		int[] arr=new int[N+1];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int a=Integer.parseInt(st.nextToken());
			arr[a]++;
		}
		
		int result=0;
		for(int i=1;i<=M;i++) {
			N-=arr[i];
			result+=arr[i]*N;
		}
		System.out.println(result);
	}
}
