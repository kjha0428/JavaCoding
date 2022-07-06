import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class TiCT11_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		
		int count=0;
		int num=0;
		for(int i=0;i<N;i++) {
			num++;
			if(num>=list.get(i)) {
				num=0;
				count++;
			}
		}
		System.out.println(count);
	}
}
