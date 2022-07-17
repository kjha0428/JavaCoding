package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj10816 {
	static int N, M;
	static int[] A, B;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine()); //������ �ִ� ���� ī���� ����
		A=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) { //���� ī�忡 ���� �ִ� ����
			A[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		st=new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken()); 
		B=new int[M]; //�� �� ������ �ִ� ���� ī������ ���ؾ� �� ����
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			B[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<B.length;i++) {
			System.out.print(upper(A,B[i])-lower(A,B[i])+" ");
		}
		
	}
	static int lower(int[] arr,int n) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int mid=(start+end)/2;
			if(arr[mid]>=n) {
				end=mid;
			}
			else start=mid+1;
		}
		return end;
	}
	
	static int upper(int[] arr,int n) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int mid=(start+end)/2;
			if(arr[mid]<=n) {
				start=mid+1;
			}
			else end=mid;
		}
		if(arr[end]==n)
			end++;
		return end;
	}

}
