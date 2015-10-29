import java.io.*;
import java.util.*;

class sansaxor{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size ;i++ ) {
				int s = Integer.parseInt(read.readLine());
				String input = read.readLine();
				String arr[] = input.split(" ");
				if(s%2==0){
					list.add(0);
				}else{
					int p= s/2 +1;

					int arr1[] = new int[arr.length];
					for (int j=0;j<arr.length ;j++ ) {
						arr1[j] = Integer.parseInt(arr[j]);
					}
//System.out.println("check"); 
					int ans=0;
					for(int j=0;j<(arr.length);j = j+2){
							ans = ans^arr1[j];
					}
					list.add(ans);
				}
			}
			for (int x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}