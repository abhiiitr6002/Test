import java.io.*;
import java.util.*;
import java.math.*;

class modified_fibo{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			String[] array = input.split(" ");
			BigInteger a = new BigInteger(array[0]);
			BigInteger b = new BigInteger(array[1]);
			int n = Integer.parseInt(array[2]);
			BigInteger ans = fibo(a,b,n);
			System.out.println(ans);
		}catch(Exception e){

		}
	}
	public static BigInteger fibo(BigInteger a,BigInteger b, int n){
		if (n==1) {
			return a; 
		}else if (n==2) {
			return b;
		}else
			return (fibo(a,b,n-1).pow(2)).add(fibo(a,b,n-2));
	}
}