import java.io.*;
import java.util.*;

class begin{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int n =Integer.parseInt(read.readLine());
			String input = read.readLine();
			char []arr = input.toCharArray();
			//char first = arr[0];
			//char last = arr[n-1];
			int ans = n;
			for (int i=0;i<(n-1) ;i++ ) {
				char first = arr[i];
				//if (arr[i]==first) {
					for (int j=i+1;j<n;j++ ) {
						if (arr[j]==first) {
							ans++;
						}
					}
				//}
			}
			System.out.println(ans);
		}catch(Exception e){

		}
	}
}