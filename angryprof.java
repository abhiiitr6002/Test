import java.io.*;
import java.util.*;

class angryprof{
	public static void main(String[] args) {
		try{
			BufferedReader read  = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<String> list = new ArrayList<String>();
			int size = Integer.parseInt(read.readLine());
			for (int i=0;i<size ;i++ ) {
				String input1 = read.readLine();
				String array[] = input1.split(" ");
				String input2 = read.readLine();
				String array2[] = input2.split(" ");
				int n= Integer.parseInt(array[0]);
				int k = Integer.parseInt(array[1]);
				int threshold = 0;
				int array3[] = new int[n];
				for (int j=0;j<n;j++ ) {
					array3[j] = Integer.parseInt(array2[j]);
					if (array3[j]<=0) {
						threshold++;
					}
				}
				if(k>threshold){
					list.add("YES");
				}else{
					list.add("NO");
				}
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}