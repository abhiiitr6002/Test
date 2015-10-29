import java.io.*;
import java.util.*;
import java.math.*;

class halloween{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String array[] = new String[size];
			for (int i=0;i<size;i++ ) {
			 	int input = Integer.parseInt(read.readLine());
			 	int first = input/2;
			 	int second =0;
			 	// product =0;
			 	if(input%2==0){
			 		second = first;
			 	}else{
			 		second = first+1;
			 	}
			 	//String ff=Integer.toString(first);
			 	BigInteger f1 =new BigInteger(Integer.toString(first));
			 	BigInteger s2 =new BigInteger(Integer.toString(second));
			 	BigInteger product = f1.multiply(s2);
			 	String pro=product.toString();
			 	array[i] = pro;
			} 
			for (int i =0;i<size;i++) {
				System.out.println(array[i]);
			}
		}catch(Exception e){

		}
	}
}