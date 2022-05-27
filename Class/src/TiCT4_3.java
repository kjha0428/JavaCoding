import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiCT4_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int[][] steps= {{-2,-1},{-2,1},{-1,-2},{-1,2},{1,-2},{1,2},{2,-1},{2,1}};
		
		int count=0;
		int col=s.charAt(0)-'a'+1;
		int row=s.charAt(1)-'0';
		
		for(int i=0;i<8;i++) {
			if(col+steps[i][1]>=1&&col+steps[i][1]<=8&&row+steps[i][0]>=1&&row+steps[i][0]<=8)
				count++;
		}
		System.out.println(count);
	}

}
