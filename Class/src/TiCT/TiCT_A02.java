package TiCT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiCT_A02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		long result=s.charAt(0)-'0';
		
		for(int i=1;i<s.length();i++) {
			int num=s.charAt(i)-'0';
			
			if(result>1&&num>1)
				result*=num;
			else
				result+=num;
		}
		System.out.println(result);
	}
}
