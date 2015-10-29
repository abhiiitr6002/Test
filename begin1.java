import java.io.*;
import java.util.*;

class begin1{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			Long nm= Long.parseLong(read.readLine());
			int n= (int)(long)nm;
			String input = read.readLine();
			char arr[] = input.toCharArray();
			//int arr_int[] = new int[n];
			Long index[] = new Long[26];
			for (int j=0;j<26 ;j++ ) {
				index[j]=0L;
			}
			//System.out.println("1");
			for (int i=0;i<n ;i++ ) {
				int bt = (int)arr[i];
				int tbt = bt -97;
				index[tbt] +=1;
			}
			//System.out.println("gh");
			Long max = 0L;
			for (int j=0;j<26 ;j++ ) {
				if (index[j]>max) {
					max =index[j];
				}
			}
			Long dy_arr[] = new Long[(int)(max+1L)];
			for (int j=0;j<(int)(max+1L) ;j++ ) {
				dy_arr[j]=-1L;
			}
			//dy_arr[0]=1L;
			//dy_arr[1]=1L;
			//dy_arr[2]=2L;
			Long ans = 0L;
			Long ans2 = 0L;
			for (int i=0;i<26 ;i++ ) {
				Long fac = 0L;
				Long fac1 =0L;
				//int ind=(int)(long)index[i];
			//	System.out.println("hj");
				if (index[i]>1) {
					//if (dy_arr[ind]>0) {
					//	fac = dy_arr[ind];
				//	}else{
				//		fac = factorial(index[i]);
				//		dy_arr[ind] = fac;
				//	}
					fac = (index[i])*(index[i]-1);
					//S ystem.out.println(ind);
					//if (dy_arr[ind-2]>0) {
					//	fac1 = dy_arr[ind-2];
					//}else{
					//	fac1 = factorial(index[i]-2L);
					//	dy_arr[ind-2] = fac1;
					//}
					//System.out.println(fac);
					ans = (fac);
					ans = ans/2L;
					ans2 +=ans;
				}
			}
			System.out.println(ans2+nm);
		}catch(Exception e){

		}
	}
	//public static Long factorial(Long n){
		//if (n<2L) {
			//return 1L;
		//}else{
		//	return n;
		//}
	//	Long ans1 = 1L;
	//	Long k =n;
		//System.out.println(n);
	//	while(k>0L){
	//		ans1 = ans1*k;
	//		k--;
	//	}
		//ystem.out.println(ans1);
	//	return ans1;
	//}
}