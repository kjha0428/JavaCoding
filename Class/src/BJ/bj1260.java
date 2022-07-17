package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj1260 {
	static boolean[] checked;
	static int[][] adjacent;
	static int N,M,V;

	public static void main(String[] args) throws IOException{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     StringTokenizer st=new StringTokenizer(br.readLine());
	     N=Integer.parseInt(st.nextToken()); //정점의 개수
	     M=Integer.parseInt(st.nextToken()); //간선의 개수
	     V=Integer.parseInt(st.nextToken()); //탐색을 시작할 정점의 번호
	     
	     adjacent=new int[N+1][N+1];
	     checked=new boolean[N+1];
	     for(int i=0;i<M;i++) { //간선이 연결하는 두 정점의 번호
	    	st=new StringTokenizer(br.readLine());
	    	int a=Integer.parseInt(st.nextToken());
	    	int b=Integer.parseInt(st.nextToken());
	    	adjacent[a][b]=adjacent[b][a]=1; 
	     }
	     DFS(V);
	     checked=new boolean[N+1];
	     System.out.println();
	     BFS(V);
	}
	static void DFS(int v) {
		checked[v]=true;
		System.out.print(v+" ");
		for(int i=1;i<=N;i++) {
			if(checked[i]==false&&adjacent[v][i]==1) {
				DFS(i);
			}
		}
	}
	
	static void BFS(int v) {
		Queue<Integer> q =new LinkedList<>();
		q.add(v);
		checked[v]=true;
		while(!q.isEmpty()) {
			v=q.poll();
			System.out.print(v+" ");
			for(int i=1;i<=N;i++) {
				if(checked[i]==false&&adjacent[v][i]==1) {
					q.add(i);
					checked[i]=true;
				}
			}
		}
	}

}
