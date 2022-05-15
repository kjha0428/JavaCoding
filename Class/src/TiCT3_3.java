import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TiCT3_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()); //숫자 카드들이 놓인 행의 개수
		int M=Integer.parseInt(st.nextToken()); //열의 개수
		
		int max=0;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			int min=Integer.MAX_VALUE;
			for(int j=0;j<M;j++) {
				int card=Integer.parseInt(st.nextToken());
				min=Math.min(min, card);
			}
			max=Math.max(max, min);
		}
		
		System.out.print(max);
	}

}
