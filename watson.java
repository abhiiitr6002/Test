import java.io.*;
import java.util.*;

class watson{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			String arr[] = input.split(" ");
			int n = Integer.parseInt(arr[0]);
			int m=Integer.parseInt(arr[1]);
			ArrayList<Integer> list = new ArrayList<Integer>();
			String input1 = read.readLine();
			String arr1[] = input1.split(" ");
			int array[] = new int[n+1];
			for (int i=1;i<=n ;i++ ) {
				array[i] = Integer.parseInt(arr1[i-1]);
			}
			array[0] =0;
			for (int j=0;j<m;j++ ) {
				String input2 = read.readLine();
				String arr2[] = input2.split(" ");
				int m1 = Integer.parseInt(arr2[0]);
				int m2 = Integer.parseInt(arr2[1]);
				int max =0;
				int count =0;
				boolean flag = true;
				for (int i=m1;i<=m2 ;i++ ) {
					if (array[i]>max) {
						max=array[i];
						count =0;
					}
					if (array[i]==max) {
						count++;
					}
				}
				list.add(count);
			}
			for (int x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}