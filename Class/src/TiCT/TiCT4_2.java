package TiCT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiCT4_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int count=0;
		
		for(int h=0;h<=N;h++) {
			for(int m=0;m<60;m++) {
				for(int s=0;s<60;s++) {
					if(h%10==3||m%10==3||m/10==3||s%10==3||s/10==3)
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
