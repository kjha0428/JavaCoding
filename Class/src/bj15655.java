import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj15655 {
	static int N,M;
	static int[] num;
	static int[] arr;
	static boolean[] checked;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		N=Integer.parseInt(s[0]);
		M=Integer.parseInt(s[1]);
		arr=new int[N];
		checked=new boolean[N+1];

		num=new int[N+1];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		
		func(0);
	}
	static void func(int a) {
		if(a==M) {
			for(int i=0;i<M;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=1;i<=N;i++) {
			if(checked[i]==false) {
				if(a==0||arr[a-1]<num[i]) {
					arr[a]=num[i];
					checked[i]=true;
					func(a+1);
					checked[i]=false;
				}
			}
		}
	}
}
