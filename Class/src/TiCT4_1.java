import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiCT4_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String s=br.readLine();
		String[] plans=s.split(" ");
		
		int x=1,y=1;
		int[] dx= {0,0,-1,1};
		int[] dy= {-1,1,0,0};
		String[] move_types= {"L","R","U","D"};
 		
		for(int i=0;i<plans.length;i++) {
			for(int j=0;j<4;j++) {
				if(plans[i].equals(move_types[j])) {
					if(x+dx[j]<1||y+dy[j]<1||x+dx[j]>N||y+dy[j]>N) 
						continue;
					else{
						x=x+dx[j];
						y=y+dy[j];
					}
				}
			}
			
		}
		System.out.println(x+" "+y);
	}

}
