package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj15650 {
	static int N,M;
	static int[] arr;
	static boolean[] checked;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		N=Integer.parseInt(s[0]);
		M=Integer.parseInt(s[1]);
		arr=new int[N];
		checked=new boolean[N+1];
		
		func(0);
	}
	static void func(int k) {
		if(k==M) {
			for(int i=0;i<M;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=1;i<=N;i++) {
			if(checked[i]==false) {
				if(k==0||arr[k-1]<i) {
					arr[k]=i;
					checked[i]=true;
					func(k+1);
					checked[i]=false;
				}
			}
		}
	}
}
