package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj11047 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int N=Integer.parseInt(s[0]); //������ �ִ� ���� ������
		int K=Integer.parseInt(s[1]); //���� ��ġ�� ��
		
		int count=0; //���� ����
		
		int[] num=new int[N];
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		while(K!=0) {
			for(int i=N-1;i>=0;i--) {
				if(K>=num[i]) {
					count+=(K/num[i]);
					K=K%num[i];
				}
			}
		}
		
		System.out.println(count);
	}
}
