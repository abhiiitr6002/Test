import java.io.*;
import java.util.*;

class maximise_sum{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Long> list = new ArrayList<Long>();
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				String input1 =read.readLine();
				String array[] = input.split(" ");
				String array1[] = input1.split(" ");
				int n = Integer.parseInt(array[0]);
				Long m = Long.parseLong(array[1]);
				Long arrayone[] = new Long[n];
				long max_div = 0L;
				for (int j=0;j<n ;j++ ) {
					arrayone[j] = Long.parseLong(array1[j]);
				}
				Long sub_array =0L;
				Long mod_array[] = new Long[n];
				for (int k=0;k<n ;k++ ) {
					mod_array[k]=arrayone[k]%m;
				}
				Long ans = max_subarray(mod_array,0,n-1,m);
				list.add(ans);
			}
			for (Long x:list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
	public static Long max_subarray(Long array[],int l,int h,Long t){
		int m =(l+h)/2;
		if (l==h) {
			return array[l];
		}
		return max(max_subarray(array,l,m,t),max_subarray(array,m+1,h,t),subarray_sum(array,m,l,h,t)%t);
	}
	public static Long max_two(Long a,Long b){
		if (a>b) 
			return a;
		else
			return b;
	}
	public static Long max(Long a,Long b,Long c){
		if (max_two(a,b)>c)
			return max_two(a,b);
		else return c;
	}
	public static Long subarray_sum(Long array[],int m,int l,int h,Long t){
		Long sum =0L;
		Long left_sum = 0L;
		Long right_sum = 0L;
		for (int i=m;i>=l ;i-- ) {
			sum +=array[i];
			sum = sum%t;
			if (sum>left_sum) {
				left_sum =sum;
			}
		}
		sum =0L;
		for (int i=(m+1);i<=h ;i++ ) {
			sum +=array[i];
			sum =sum%t;
			if ((sum)>right_sum) {
				right_sum = sum;
			}
		}
		return left_sum+right_sum;
	}
}