import java.io.*;
import java.util.*;

class max_subarray{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size;i++ ) {
				int size_subarray = Integer.parseInt(read.readLine());
				String input = read.readLine();
				String []array = input.split(" ");
				int ans =0;
				int sum =0;
				int sum_positive = 0;
				int least_negative = Integer.MIN_VALUE;
				boolean flag = false;
				for (int j=0;j<size_subarray ;j++ ) {
					int value =Integer.parseInt(array[j]);
					sum +=value;
					if (value>=0) {
						if (value==0) {
							flag = true;
						}
						sum_positive += value;
					}else{
						if (value>least_negative) {
							least_negative=value;
						}
					}
					if(sum<0){
						sum =0;
					}
					if (sum>ans) {
						ans = sum;
					}
				}
				if (sum_positive>0) {
					list.add(ans);
					list.add(sum_positive);
				}else if (flag) {
					list.add(ans);
					list.add(sum_positive);
				}else{
					list.add(least_negative);
					list.add(least_negative);
				}
			}
			for (int i=0;i<(2*size) ;i=i+2 ) {
				System.out.println(list.get(i)+" "+list.get(i+1));
			}
		}catch(Exception e){

		}
	}
}