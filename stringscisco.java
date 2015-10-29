import java.io.*;
import java.util.*;

class stringscisco{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<String> list  = new ArrayList<String>();
			int size = Integer.parseInt(read.readLine());
			for (int i=0;i<size;i++ ) {
				String input = read.readLine();
				char []arr = input.toCharArray();
				int array[] = new int[26];
				for (int j=0;j<arr.length;j++ ) {
					int bet =(int)arr[j];
					bet =bet-97;
					array[bet]++;
				}
				int sum = 0;
				for (int k=1;k<26 ;k++ ) {
					sum = sum + array[k]*k;
				}
				if (sum%2==0) {
					list.add("Bob");
				}else{
					list.add("Alice");
				}
			}
			for (String x:list) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}