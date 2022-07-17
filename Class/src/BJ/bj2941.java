package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2941 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		str=str.replaceAll("c=", "1");
		str=str.replaceAll("c-", "2");
		str=str.replaceAll("dz=", "3");
		str=str.replaceAll("d-", "4");
		str=str.replaceAll("lj", "5");
		str=str.replaceAll("nj", "6");
		str=str.replaceAll("s=", "7");
		str=str.replaceAll("z=", "8");
		
		System.out.println(str.length());
	}
}
