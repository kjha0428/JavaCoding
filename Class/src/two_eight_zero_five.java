import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class two_eight_zero_five{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()); //나무의 수
        int M=Integer.parseInt(st.nextToken()); //집으로 가져가려고 하는 나무의 길이
        
        int[] trees=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
        	trees[i]=Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(trees);
        
        System.out.println(binarySearch(trees,M));
    }
    static long binarySearch(int[] arr, int a){
        long start=0;
        long mid;
        long end=arr[arr.length-1];
        while(start<=end){
            long sum=0;
            mid=(start+end)/2;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>mid)
                    sum+=arr[i]-mid;
            }
            if(sum<a)
                end=mid-1;
            else if(sum>=a)
                start=mid+1;
        }
        return end;
    }
}