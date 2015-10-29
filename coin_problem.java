import java.io.*;
import java.util.*;
import java.lang.*;

class coin_problem{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input= read.readLine();
			String array[] = input.split(" ");
			String input1 = read.readLine();
			String array1[] = input1.split(" ");
			int n = Integer.parseInt(array[0]);
			int m = Integer.parseInt(array[1]);
			int array2[] = new int[m];
			for (int i=0;i<m ;i++ ) {
				array2[i] = Integer.parseInt(array1[i]);
			}
			Long ans = coin(array2,m,n);
			System.out.println(ans);
		}catch(Exception e){

		}
	}
	public static Long coin(int []s,int m,int n){
		Long []array = new Long[n+1];
		array[0] = 1L;
		for(int g=1;g<array.length;g++){
			array[g]=0L;
		}
	//	System.out.println("dd");
		for (int i=0;i<m ;i++ ) {
			//System.out.println(s[i]);
			for (int j=s[i];j<=n ;j++ ) {
				//System.out.println(array[j]);
				array[j] = array[j]+array[j-s[i]];
				//System.out.println(j);
			}
		}
		return array[n];
	}
}