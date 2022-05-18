import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
public class bj2178{
    static int N,M;
    static int[][] maze;
    static boolean[][] checked;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        
        maze=new int[N][M];
        checked=new boolean[N][M];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            for(int j=0;j<str.length();j++){
                maze[i][j]=str.charAt(j)-'0';
            }
        }
        BFS();
        System.out.println(maze[N-1][M-1]);
    }
    
    public static void BFS(){
        Queue<Integer> qx=new LinkedList<>();
        Queue<Integer> qy=new LinkedList<>();
        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};
        
        qx.add(0);
        qy.add(0);
        checked[0][0]=true;
        
        while(!qx.isEmpty()){
            int x=qx.poll();
            int y=qy.poll();
            for(int i=0;i<4;i++){
                int xx=x+dx[i];
                int yy=y+dy[i];
                if(xx>=0&&yy>=0&&xx<N&&yy<M){
                    if(maze[xx][yy]==1&&checked[xx][yy]==false){
                        qx.add(xx);
                        qy.add(yy);
                        checked[xx][yy]=true;
                        maze[xx][yy]=maze[x][y]+1; 
                    }
                }
            }
        }
    }
}