import java.io.*;
import java.util.*;

class xor{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int first = Integer.parseInt(read.readLine());
			int second = Integer.parseInt(read.readLine());
			int ans =0;
			for (int i=first;i<=second;i++) {
				for(int j=i;j<=second;j++){
					int xor_ans = i^j;
					if (xor_ans>ans) {
						ans =xor_ans;
					}
				}
			}
			//int ans = first ^ second;
			System.out.println(ans);
		}catch(Exception e){

		}
	}
}