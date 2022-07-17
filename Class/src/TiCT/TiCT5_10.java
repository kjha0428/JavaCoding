package TiCT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TiCT5_10 {

	static int N,M;
	static int[][] board;
	static boolean[][] checked;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		N=Integer.parseInt(s[0]); //세로
		M=Integer.parseInt(s[1]); //가로
				
		board=new int[N][M];
		checked=new boolean[N][M];
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine(),"");
			String str=st.nextToken();
			for(int j=0;j<M;j++) {
				board[i][j]=str.charAt(j)-'0';
			}
		}
		
		int count=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(board[i][j]==0&&checked[i][j]==false) {
					count++;
					DFS(i,j);
				}
			}
		}
		System.out.println(count);
	}
	static void DFS(int a, int b) {
		int[] dx= {0,-1,0,1};
		int[] dy= {-1,0,1,0};
		checked[a][b]=true;
		
		for(int i=0;i<4;i++) {
			int x=a+dx[i];
			int y=b+dy[i];
			
			if(x>=0&&y>=0&&x<N&&y<M) {
				if(board[x][y]==0&&checked[x][y]==false) {
					DFS(x,y);
				}	
			}
		}
	}
}
