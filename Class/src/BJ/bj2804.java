package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2804 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		String A=str[0];
		String B=str[1];
		
		int a_idx=0,b_idx=0;
		Outter:for(int i=0;i<A.length();i++) {
			for(int j=0;j<B.length();j++) {
				if(A.charAt(i)==B.charAt(j)) {
					a_idx=i;
					b_idx=j;
					break Outter;
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<B.length();i++) {
			if(i==b_idx) {
				sb.append(A).append("\n");
			}
			else {
				for(int j=0;j<A.length();j++) {
					if(j==a_idx) {
						sb.append(B.charAt(i));
					}
					else {
						sb.append(".");
					}
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
