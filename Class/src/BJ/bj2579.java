package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class bj2579{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        
        int[] score=new int[N+1];
        int[] sum=new int[N+1];
        
        for(int i=1;i<=N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            score[i]=Integer.parseInt(st.nextToken());
        }
        
        if(N>=3) {        
        	sum[1]=score[1];
        	sum[2]=score[1]+score[2];
        	
        	for(int i=3;i<=N;i++)
        		sum[i]=Math.max(sum[i-2]+score[i],sum[i-3]+score[i-1]+score[i]);
        
        	System.out.println(sum[N]);
        }
        
        else {
        	if(N==1) {
        		System.out.println(score[1]);
        		return;
        	}
        	else{
        		System.out.println(score[1]+score[2]);
        		return;
        	}
        }
    }
}