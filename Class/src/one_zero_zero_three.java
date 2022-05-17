import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class one_zero_zero_three{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine()); //테스트 케이스의 수
        
        int[] zero=new int[41];
        int[] one=new int[41];
        zero[0]=1;
        zero[1]=0;
        one[0]=0;
        one[1]=1;
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            for(int j=2;j<=N;j++) {
            	zero[j]=zero[j-1]+zero[j-2];
            	one[j]=one[j-1]+one[j-2];
            }
            bw.write(zero[N]+" "+one[N]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    
}