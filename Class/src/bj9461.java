import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj9461 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		for(int test_case=1;test_case<=T;test_case++) {
			int N=Integer.parseInt(br.readLine());
			long[] num=new long[101];
			num[1]=1;
			num[2]=1;
			num[3]=1;
			for(int i=4;i<=N;i++) {
				num[i]=num[i-2]+num[i-3];
			}
			System.out.println(num[N]);
		}
	}
}
