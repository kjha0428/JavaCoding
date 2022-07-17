package BJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj9375 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		for(int test_case=1;test_case<=T;test_case++) {
			HashMap<String,Integer> map=new HashMap<>();
			int result=1;
			int n=Integer.parseInt(br.readLine()); // 해빈이가 가진 의상의 수
			
			for(int i=0;i<n;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				String[] s= new String[2]; //(의상 이름, 의상 종류)
				String name=st.nextToken();
				String kind=st.nextToken();

				if(map.containsKey(kind)) map.put(kind, map.get(kind)+1);
				else map.put(kind, 1);
			}
			for(int i:map.values())
				result*=(i+1);
			System.out.println(result-1);			
			
		}

	}

}