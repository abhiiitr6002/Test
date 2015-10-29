import java.io.*;
import java.util.*;
import java.math.*;

class long_factorials{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int input = Integer.parseInt(read.readLine());
			//BigInteger []arr = new BigInteger[101];
			//arr[0]=new BigInteger("1");
			//arr[1]=new BigInteger("1");
			//arr[2]=new BigInteger("2");
			//boolean flag =true;
			BigInteger ans = new BigInteger("1");
			BigInteger zero= new BigInteger("0");
			for (int i=input;i>0 ;i-- ) {
				BigInteger now = new BigInteger(Integer.toString(i));
					ans = ans.multiply(now);
			}
			System.out.print(ans);
		}catch(Exception e){

		}
	}
}