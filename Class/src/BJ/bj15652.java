package BJ;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj15652 {
	static int N,M;
	static int[] arr;
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s=br.readLine().split(" ");
		N=Integer.parseInt(s[0]);
		M=Integer.parseInt(s[1]);
		arr=new int[N];
		
		func(0);
		
		bw.flush();
		bw.close();
		br.close();
	}
	static void func(int a) throws IOException {
		if(a==M) {
			for(int i=0;i<M;i++) {
				bw.write(arr[i]+" ");
			}
			bw.write("\n");
			return;
		}
		for(int i=1;i<=N;i++) {
			if(a==0||arr[a-1]<=i) {
				arr[a]=i;
				func(a+1);
			}
		}
	}
}
