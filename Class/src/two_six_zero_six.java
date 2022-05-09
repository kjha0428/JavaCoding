import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class two_six_zero_six {

	static boolean[] checked;
	static int[][] adjacent;
	static int N,M,count;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine()); //��ǻ���� ��
		M=Integer.parseInt(br.readLine()); //��Ʈ��ũ �󿡼� ���� ����Ǿ� �ִ� ��ǻ�� ���� ��
		
		checked=new boolean[N+1];
		adjacent=new int[N+1][N+1];
		for(int i=0;i<M;i++) { //��Ʈ��ũ �󿡼� ���� ����Ǿ� �ִ� ��ǻ�� ��ȣ ��
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			adjacent[a][b]=adjacent[b][a]=1;
		}
		
		count=0;
		DFS(1);
		System.out.println(count);
	}
	static void DFS(int x){
		checked[x]=true;
		for(int i=1;i<=N;i++) {
			if(adjacent[x][i]==1&&checked[i]==false) {
				checked[i]=true;
				count++;
				DFS(i);
			}
		}
	}
}