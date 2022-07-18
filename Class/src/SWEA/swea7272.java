package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class swea7272 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int test_case=1;test_case<=T;test_case++) {
			String str1=sc.next();
			String str2=sc.next();
			
			int[] arr1=new int[str1.length()];
			int[] arr2=new int[str2.length()];
			
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)=='B') arr1[i]=2;
				else if(str1.charAt(i)=='A'||str1.charAt(i)=='D'||str1.charAt(i)=='O'||str1.charAt(i)=='P'||str1.charAt(i)=='Q'||str1.charAt(i)=='R')
					arr1[i]=1;
				else arr1[i]=0;
			}
			
			for(int i=0;i<str2.length();i++) {
				if(str2.charAt(i)=='B') arr2[i]=2;
				else if(str2.charAt(i)=='A'||str2.charAt(i)=='D'||str2.charAt(i)=='O'||str2.charAt(i)=='P'||str2.charAt(i)=='Q'||str2.charAt(i)=='R')
					arr2[i]=1;
				else arr2[i]=0;
			}
			
			if(Arrays.equals(arr1,arr2)) System.out.println("#"+test_case+" SAME");
			else System.out.println("#"+test_case+" DIFF");
		}
		sc.close();
	}
}