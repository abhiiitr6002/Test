import java.io.*;
import java.lang.Math.*;
import java.util.*;
import java.math.*;

class euler{
	public static void main(String[] args) {
		try{
			ArrayList<String> list = new ArrayList<String>();
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			for (int i=0;i<size;i++) {
				String input = read.readLine();
				String []array = input.split(" ");
				//int a = Integer.parseInt(array[0]);
				//int m = Integer.parseInt(array[1]);
				//double p =(double)m;
				//if (a>=6) {
				//	 p= (double)((a/2)+1);
				//}else if(a>0){
				//	p =(double)((a*2)+1);
				//}
				BigInteger bi1 = new BigInteger(array[0]);
				BigInteger bi2 = new BigInteger(array[1]);
				//double a1 = (double)(a);
				//int ans =(int) Math.pow(a1,((p-1)/2));
				BigInteger bi3 = new BigInteger("1");
				BigInteger bi4 = bi2.subtract(bi3);
				BigInteger bi5 = new BigInteger("2");
				BigInteger bi6 = bi4.divide(bi5);
				BigInteger ans2 = bi1.modPow(bi6,bi2);
				String ans1 = ans2.toString();
				int ans = Integer.parseInt(ans1);
				int ans_check =(ans%m);
				if (ans_check==1) {
					list.add("YES");
				}else{
					list.add("NO");
				}
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}