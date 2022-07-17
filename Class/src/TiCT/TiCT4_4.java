package TiCT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TiCT4_4 {

	static int N,M,A,B,d;
	static int[] d_A= {-1,0,1,0};
	static int[] d_B= {0,1,0,-1};
	static int[][] map;
	static boolean[][] checked;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s1=br.readLine().split(" ");
		N=Integer.parseInt(s1[0]); //세로
		M=Integer.parseInt(s1[1]); //가로
		map=new int[N][M];
		checked=new boolean[N][M];
		
		String[] s2=br.readLine().split(" ");
		A=Integer.parseInt(s2[0]);
		B=Integer.parseInt(s2[1]);
		d=Integer.parseInt(s2[2]);
		checked[A][B]=true;
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int count=1; 
		int turn_time=0;
		while(true) {
			turn_left();
			int a=A+d_A[d];
			int b=B+d_B[d];
			if(map[a][b]==0&&checked[a][b]==false) {
				checked[a][b]=true;
				A=a;
				B=b;
				count++;
				turn_time=0;
				continue;
			}
			else turn_time++;
			
			if(turn_time==4) {
				a=A-d_A[d];
				b=B-d_B[d];
				if(map[a][b]==0) {
					A=a;
					B=b;
				}
				else break;
				turn_time=0;
			}
		}
		System.out.println(count);
		
	}
	static void turn_left() {
		if(d==0) d=3;
		else d-=1;
	}
}
