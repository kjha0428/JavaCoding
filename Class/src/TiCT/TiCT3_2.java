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
		int N=Integer.parseInt(st.nextToken()); //�迭�� ũ��
		int M=Integer.parseInt(st.nextToken()); //���ڰ� �������� Ƚ��
		int K=Integer.parseInt(st.nextToken()); //�迭�� Ư���� �ε����� �ش��ϴ� ���� �����Ͽ� ������ �� �ִ� �ִ� ����
		
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
