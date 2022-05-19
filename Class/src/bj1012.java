import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj1012 {
	static int M,N,K,count;
	static int[][] board;
	static boolean[][] checked;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()); //테스트 케이스 수
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<T;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			M=Integer.parseInt(st.nextToken()); //가로
			N=Integer.parseInt(st.nextToken()); //세로
			K=Integer.parseInt(st.nextToken()); //배추가 심어져 있는 위치의 개수
			board=new int[N][M];
			checked=new boolean[N][M];
			count=0;
			
			for(int j=0;j<K;j++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				board[b][a]=1;
				
			}
			
			for(int a1=0;a1<N;a1++) {
				for(int b1=0;b1<M;b1++) {
					if(board[a1][b1]==1&&checked[a1][b1]==false) {
						DFS(a1,b1);
						count++;
					}
				}
			}
			list.add(count);
		}
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	
	static void DFS(int a, int b) {
		int[] dx= {-1,0,1,0};
		int[] dy= {0,-1,0,1};
		
		checked[a][b]=true;
		for(int i=0;i<4;i++) {
			int x=a+dx[i];
			int y=b+dy[i];
			if(x>=0&&y>=0&&x<N&&y<M) {
				if(board[x][y]==1&&checked[x][y]==false) {
					DFS(x,y);
				}
			}
		}
	}

}
