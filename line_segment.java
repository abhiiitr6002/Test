import java.io.*;
import java.util.*;

class line_segment{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			int array_2d[][] = new int[size][2];
			//int[] diff = new int[size];
			for (int i=0;i<size;i++ ) {
				String input = read.readLine();
				String[] arr=input.split(" ");
				int one = Integer.parseInt(arr[0]);
				int two = Integer.parseInt(arr[1]);
				array_2d[i][0]=one;
				array_2d[i][1]=two;
				//diff[i]=Math.abs(two-one);	
			}
			int ans=0;
			for (int i=0;i<(size-1) ;i++ ) {
				
				if (array_2d[i][0]>0) {
					boolean flag = true;
				for (int j=i+1;(j<size);j++ ) {
					//boolean flag1 =true;
					int diff_h = array_2d[i][0]-array_2d[j][0];
					int diff_v = array_2d[i][1]-array_2d[j][1];
					if (diff_h<=0 && diff_v>=0) {
						flag =false;
					}
					if (diff_h>=0 && diff_v<=0) {
						//flag1=false;
						array_2d[j][0]=0;
						array_2d[j][1]=0;
					}
					//if (diff_h==0 && diff_v==0) {
					//	array_2d[j][0]=0;
					//	array_2d[j][1]=0;
					//}
				}
				if (flag) {
					System.out.println(i);
					ans++;
				}
			}
			}
			if (array_2d[size-1][0]>0 && array_2d[size-1][1]>0) {
				ans++;
			}
			System.out.println(ans);
		}catch(Exception e){

		}
	}
}