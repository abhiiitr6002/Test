import java.io.*;
import java.util.*;

class index_product{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String input = read.readLine();
			String []array = input.split(" ");
			int array1[] = new int[size];
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size ;i++ ) {
				array1[i] = Integer.parseInt(array[i]);
			}
			int ans = 0;
			int final_ans = 0;
			boolean flag = true;
			if (size==2) {
				final_ans = 0;
			}else{
			for (int j =(size-2);j>(size/2)-1 ;j-- ) {
				int first_index = j;
				int index_required =0;
				int index_required2 = 0;
				boolean flag1 = true;
				boolean flag2 = true;
				for (int k=j+1;k<size&&flag1 ;k++ ) {
					int fixed = array1[j];
					if (fixed<array1[k]) {
						index_required = k;
						flag1 =false;
					}
				}
				for (int k=j-1;k>=0 && flag2;k-- ) {
					int fixed = array1[j];
					if (fixed<array1[k]) {
						index_required2 = k;
						flag2 = false;
					}
				}
				ans = (index_required+1) * (index_required2+1);
				//list.add(ans);
				if (ans>final_ans) {
					final_ans =ans;
				}
			}}
			//Collections.sort(list);
			System.out.println(final_ans);
			//for (int x :list ) {
			//	System.out.println(x);
			//}
		}catch(Exception e){

		}
	}
}