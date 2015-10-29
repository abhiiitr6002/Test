import java.io.*;
import java.util.*;

class div_conq{
	public static void main(String[] args) {
		try{
			//BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int array[] = new int[]{1,8,9,5,10,5,6};
			int ans = max_element(array,0,6);
			System.out.println(ans);
		}catch(Exception e){

		}
	}
	public static int max_element(int array[],int l,int h){
		if (l==h) {
			return array[l];
		}
		int m= (l+h)/2;
		return max(max_element(array,l,m),max_element(array,m+1,h));
	}
	public static int max(int a,int b){
		if (a>b) return a;
			else return b;
	} 
}