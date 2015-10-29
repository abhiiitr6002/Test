import java.io.*;
import java.util.*;

class schedulling{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			int start[] = new int[size];
			int end[] = new int[size];
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				String arr[] = input.split(" ");
				start[i] = Integer.parseInt(arr[0]);
				end[i] = Integer.parseInt(arr[1]);
			}

			for(int i=0;i<(size-1);i++){
				for (int j=(i+1);j<size ;j++ ) {
					if (end[i]>end[j]) {
						int swap = end[i];
						end[i] = end[j];
						end[j] = swap;
						int swap2= start[i];
						start[i] = start[j];
						start[j] = swap2;
					}
				}
			}
//for(int j=0; j<size;j++){
//System.out.println(start[j]);
//}
int ans=1;
//System.out.println("check");
			
			for (int j=0;j<size ;j++ ) {
				int bet =end[j];
				int i=j+1;

				while((end[i]==end[j] )&& (i<size)){
					i++;
				}
//System.out.println(j);
//System.out.println(ans);
				//j=i+1;
				int bet1 = end[i];
				int k=i;
				boolean flag = true;
				while(end[k]==end[i]&& k<size){
					if (start[k]>=end[j] && flag) {
						ans++;
						flag =false;
//System.out.println("check1");
					}
					k++;
				}
j= i-1;
System.out.println(j);
//System.out.println(ans);
				
			}
			System.out.println(ans);
		}catch(Exception e){}
	}
}