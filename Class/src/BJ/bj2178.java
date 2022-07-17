package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
public class bj2178{
    static int[][] maze;
    static boolean[][] checked;
    static int N,M;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken()); //(N.M)
        M=Integer.parseInt(st.nextToken());
        
        maze=new int[N+1][M+1];
        checked=new boolean[N+1][M+1];
        for(int i=1;i<=N;i++){
            st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            for(int j=0;j<str.length();j++){
                maze[i][j+1]=str.charAt(j)-'0';
            }
        }
        BFS();
        System.out.println(maze[N][M]);
    }
    static void BFS(){
        Queue<Integer> qx=new LinkedList<>();
        Queue<Integer> qy=new LinkedList<>();     
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        
        qx.add(1);
        qy.add(1);
        while(!qx.isEmpty()){
            int x=qx.poll();
            int y=qy.poll();
            for(int i=0;i<4;i++){
                int xx=x+dx[i];
                int yy=y+dy[i];
                if(xx>=0&&yy>=0&&xx<=N&&yy<=M){
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