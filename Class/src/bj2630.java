import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj2630 {
	
	static int[][] paper;
	static int white_cnt=0;
	static int blue_cnt=0;

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		
		paper=new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				paper[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		dividePaper(0,0,N);
		bw.write(white_cnt+"\n"+blue_cnt);
		
		bw.flush();
		bw.close();
		br.close();
	}
	static void dividePaper(int x, int y, int n) {
		if(checkSame(x, y, n)) {
			if(paper[x][y]==0) white_cnt++;
			else blue_cnt++;
			return;
		}
		dividePaper(x,y,n/2);
		dividePaper(x+n/2,y,n/2);
		dividePaper(x,y+n/2,n/2);
		dividePaper(x+n/2,y+n/2,n/2);
	}
	
	static boolean checkSame(int x, int y, int n){
		for(int i=x;i<x+n;i++) {
			for(int j=y;j<y+n;j++) {
				if(paper[i][j]!=paper[x][y])
					return false;
			}
		}
		return true;
	}

}