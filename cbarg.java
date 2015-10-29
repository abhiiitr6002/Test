import java.io.*;
import java.util.*;

class cbarg{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Long> list1 = new ArrayList<Long>();
			for (int i=0 ;i<size;i++ ) {
				int size1 = Integer.parseInt(read.readLine());
				String input = read.readLine();
				String []array1 = input.split(" ");
				Long array[] = new Long[size1];
				//ArrayList<Integer> list = new ArrayList<Integer>();
				Long ans=new Long(0);
				array[0] = Long.parseLong(array1[0]);
				ans = array[0];
				for (int j=1;j<size1 ;j++ ) {
					array[j]=Long.parseLong(array1[j]);
					if (array[j]>array[j-1]) {
						Long diff = array[j]-array[j-1];
						ans +=diff;
					}
				}
				//Collections.sort(list);
				//int max_index = list.size();
				list1.add(ans);
			}
			for (Long x :list1 ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}