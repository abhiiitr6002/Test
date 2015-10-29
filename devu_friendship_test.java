import java.io.*;
import java.util.*;

class devu_friendship_test{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size ;i++ ) {
				int no_of_frnd = Integer.parseInt(read.readLine());
				String input = read.readLine();
				String array[] = input.split(" ");
				int arrayone[] = new int[101];
				int ans =0;
				for (int j=0;j<no_of_frnd ;j++ ) {
					int value = Integer.parseInt(array[j]);
					arrayone[value] += 1;
				}
				for (int k=1;k<101 ;k++ ) {
					if (arrayone[k]>=1) {
						ans +=1;
					}
				}
				list.add(ans);
			}
			for (int x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}