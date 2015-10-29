import java.io.*;
import java.util.*;

class perfect_hiring{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			int index =-1;
			String arr[] = input.split(" ");
			int n = Integer.parseInt(arr[0]);
			Long p = Long.parseLong(arr[1]);
			Long x = Long.parseLong(arr[2]);
			String input1 = read.readLine();
			String arr1[] = input1.split(" ");
			Long array[] = new Long[n];
			for (int j=0;j<n ;j++ ) {
				array[j] = Long.parseLong(arr1[j]);
			}
			Long ans =0L;
			Long temp =0L;
			for (int i=0;i<n ;i++ ) {
				ans = p*array[i];
				p -=x;
				if (ans>temp) {
					temp =ans;
					index = i;
				}
			}
			System.out.println(index+1);
		}catch(Exception e){

		}
	}
}