import java.io.*;
import java.util.*;

class funny_string{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			boolean flag = false;
			ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i<size ;i++ ) {
				flag = false;
				String input = read.readLine();
				char array[] = input.toCharArray();
				int arrayone[] = new int[array.length];
				for (int j=0;j<array.length ;j++ ) {
					arrayone[j] = (int)array[j];
				}
				for (int k=0;k<array.length-1;k++ ) {
					int first = arrayone[k+1] - arrayone[k];
					int last = arrayone[(array.length)-1-k] -arrayone[(array.length-2-k)];
					int first_abs = Math.abs(first);
					int second_abs = Math.abs(last);
					if (first_abs!=second_abs) {
						flag = true;
						break;
					}
				}
				if (flag) {
					list.add("Not Funny");
				}else{
					list.add("Funny");
				}
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}