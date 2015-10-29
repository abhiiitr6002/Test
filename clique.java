import java.io.*;
import java.util.*;

class clique{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size =Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				String[] arr = input.split(" ");
				int n = Integer.parseInt(arr[0]);
				int m= Integer.parseInt(arr[1]);
				double ans = (2*m);
				ans =ans/(n*n);
				//System.out.println(ans);
				ans = 1-ans;
				ans = 1/ans;
				int final_ans =(int)Math.ceil(ans);
				list.add(final_ans);
			}
			for (int x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}