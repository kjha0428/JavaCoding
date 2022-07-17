package TiCT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TiCT3_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()); //배열의 크기
		int M=Integer.parseInt(st.nextToken()); //숫자가 더해지는 횟수
		int K=Integer.parseInt(st.nextToken()); //배열의 특정한 인덱스에 해당하는 수가 연속하여 더해질 수 있는 최대 개수
		
		int result=0;
		int count;
		
		int[] num=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			num[i]=Integer.parseInt(st.nextToken());
		
		Arrays.sort(num);
		
		count=(int)(M/(K+1))*K+(M%(K+1));
		
		result+=count*num[N-1]+(M-count)*num[N-2];
		
		System.out.print(result);
	}

}
