import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj17626 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int[] num=new int[n+1];
		num[1]=1;
		
		for(int i=2;i<=n;i++) {
			int min=Integer.MAX_VALUE;
			
			for(int j=1;j<=(int)Math.sqrt(i);j++) {
				int a=i-j*j;
				min=Math.min(min, num[a]+1);
			}
			num[i]=min;
		}
		
		System.out.println(num[n]);
	}
}