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
		N=Integer.parseInt(br.readLine()); //가지고 있는 숫자 카드의 개수
		A=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) { //숫자 카드에 적혀 있는 정수
			A[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		st=new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken()); 
		B=new int[M]; //몇 개 가지고 있는 숫자 카드인지 구해야 할 정수
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
