package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
public class bj2667{
    static int N;
    static int board[][];
    static boolean checked[][];
    static int count;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine()); //지도의 크기
        
        board=new int[N][N];
        checked=new boolean[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            for(int j=0;j<N;j++){
                board[i][j]=str.charAt(j)-'0';
            }
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                count=0;
                if(board[i][j]==1&&checked[i][j]==false){
                    DFS(i,j);
                    result.add(count);
                }
            }
        }
        
        Collections.sort(result);
        System.out.println(result.size());
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
    
    static void DFS(int a, int b){
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        
        checked[a][b]=true;
        count++;
        
        for(int i=0;i<4;i++){
            int x=a+dx[i];
            int y=b+dy[i];
            if(x>=0&&y>=0&&x<N&&y<N){
                if(board[x][y]==1&&checked[x][y]==false){
                    DFS(x,y);
                }
            }
        }
    }
}
