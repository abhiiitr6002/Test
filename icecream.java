import java.io.*;
import java.util.*;

class icecream{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i<size ;i++ ) {
				int m = Integer.parseInt(read.readLine());
				int n = Integer.parseInt(read.readLine());
				String input = read.readLine();
				String array[] = input.split(" ");
				int array1[] = new int[array.length];
				for (int j=0;j<array.length ;j++ ) {
					array1[j] = Integer.parseInt(array[j]);
				}
				boolean flag = true;
				int first_index = 0;
				int second_index =0;
				for (int k=0;k<n && flag;k++ ) {
					first_index = k;
					int first = array1[k];
					int required = m- first;
					for (int l=k+1;l<n ;l++ ) {
						if(array1[l]==required){
							flag =false;
							second_index = l;
						}
					}
				}
				String first_index1 = Integer.toString(first_index+1);
				String second_index2 = Integer.toString(second_index+1);
				StringBuilder builder  = new StringBuilder();
				builder.append(first_index1);
				builder.append(" ");
				builder.append(second_index2);
				list.add(builder.toString());
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}