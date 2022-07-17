package TiCT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TiCT5_11 {
	static int N,M;
	static int[][] maze;
	static boolean[][] checked;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s1=br.readLine().split(" ");
		N=Integer.parseInt(s1[0]); //세로
		M=Integer.parseInt(s1[1]); //가로
		
		maze=new int[N+1][M+1];
		checked=new boolean[N+1][M+1];
		for(int i=1;i<=N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String s2=st.nextToken();
			for(int j=0;j<M;j++) {
				maze[i][j+1]=s2.charAt(j)-'0';
			}
		}
		BFS();
		System.out.println(maze[N][M]);
		
	}
	static void BFS() {
		Queue<Integer> qx=new LinkedList<>();
		Queue<Integer> qy=new LinkedList<>();
		int[] dx= {0,-1,0,1};
		int[] dy= {-1,0,1,0};
		
		qx.add(1);
		qy.add(1);
		
		while(!qx.isEmpty()) {
			int a=qx.poll();
			int b=qy.poll();
			
			for(int i=0;i<4;i++) {
				int x=a+dx[i];
				int y=b+dy[i];
				if(x>=0&&y>=0&&x<=N&&y<=M) {
					if(maze[x][y]==1&&checked[x][y]==false) {
						qx.add(x);
						qy.add(y);
						checked[x][y]=true;
						maze[x][y]=maze[a][b]+1;
					}
				}
			}
		}	
	}
	
}
