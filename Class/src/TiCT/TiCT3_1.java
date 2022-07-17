package TiCT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiCT3_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int count=0;
		
		int[] coin= {500,100,50,10};
		
		for(int i=0;i<coin.length;i++) {
			count+=N/coin[i];
			N%=coin[i];
		}
		
		System.out.print(count);
	}

}
