package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj9663 {
	static int N,count;
	static boolean[] checked1,checked2,checked3;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		checked1=new boolean[N]; //��(y)
		checked2=new boolean[(N-1)*2+1]; //�Ʒ����� �� �밢(x+y)
		checked3=new boolean[(N-1)*2+1]; //������ �Ʒ� �밢(x-y+n+1)
		
		count=0;
		func(0);
		System.out.println(count);
	}
	static void func(int a) {
		if(a==N) {
			count++;
			return;
		}
		for(int i=0;i<N;i++) {
			if(checked1[i]==false&&checked2[a+i]==false&&checked3[a-i+N-1]==false) {
				checked1[i]=true;
				checked2[a+i]=true;
				checked3[a-i+N-1]=true;
				func(a+1);
				checked1[i]=false;
				checked2[a+i]=false;
				checked3[a-i+N-1]=false;
			}
		}
	}
}
