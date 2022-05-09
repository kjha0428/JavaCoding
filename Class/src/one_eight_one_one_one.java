import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class one_eight_one_one_one{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()); //세로
		int M=Integer.parseInt(st.nextToken()); //가로
		int B=Integer.parseInt(st.nextToken()); //인벤토리 블록의 수
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int[][] board=new int[N][M];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                board[i][j]=Integer.parseInt(st.nextToken());
                min=Math.min(min,board[i][j]);
                max=Math.max(max,board[i][j]);
            }
        }
        
        int height=0;
        int minTime=Integer.MAX_VALUE;
        for(int k=min;k<=max;k++){
            int time=0;
            int block=B;
            
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(board[i][j]>k){
                        time+=(board[i][j]-k)*2;
                        block+=(board[i][j]-k);
                    }
                    else if(board[i][j]<k){
                        time+=(k-board[i][j]);
                        block-=(k-board[i][j]);
                    }
                }
            }
            if(block>=0&&time<=minTime){
                minTime=time;
                height=k;
            }
        }
        bw.write(minTime+" "+height);
        
        bw.flush();
        bw.close();
        br.close();
    }
}