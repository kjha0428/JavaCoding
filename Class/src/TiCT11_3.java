import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiCT11_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		
		int count_zero=0;
		int count_one=0;
		
		if(S.charAt(0)=='0') count_one++;
		else count_zero++;
		
		for(int i=1;i<S.length();i++) {
			if(S.charAt(i)!=S.charAt(i-1)) {
				if(S.charAt(i)=='0') count_one++;
				else count_zero++;
			}
		}
		System.out.println(Math.min(count_zero, count_one));
	}
}
