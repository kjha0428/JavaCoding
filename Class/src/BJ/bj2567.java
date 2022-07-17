package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2567 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int[][] arr=new int[101][101];
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
			for(int j=x;j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					arr[j][k]=1;
				}
			}
		}
		
		int count=0;
		int[] dx= {0,-1,0,1};
		int[] dy= {-1,0,1,0};
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(arr[i][j]==1) {
					for(int k=0;k<4;k++) {
						int a=i+dx[k];
						int b=j+dy[k];
						if(a>=0&&a<100&&b>=0&&b<100&&arr[a][b]==0) count++;
						else if(a<0||a>=100||b<1||b>=100) count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}