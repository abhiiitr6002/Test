import java.io.*;
import java.util.*;

class candies{
	public static void main(String[] args) {
		try{
			BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
			int size=Integer.parseInt(read.readLine());
			int arr[] = new int[size];
			for (int i=0;i<size ;i++ ) {
				arr[i] = Integer.parseInt(read.readLine());
			}
			int candy[] = new int[size];
			if (arr[0]>arr[1]) {
				candy[0] = 2;
			}else{
				candy[0]=1;
			}
			int ans =0;
			int d=0;
			for (int j=1;j<size ;j++ ) {
				if (arr[j]>arr[j-1]) {
					candy[j] = candy[j-1]+1;
				}
			}
			for (int j=size-1;j>0 ;j-- ) {
				if (arr[j]<arr[j-1]) {
					candy[j-1] = candy[j]+1;
				}else if(arr[j]==arr[j-1]){
					candy[j]=1;
				}
			}
			for (int j=0;j<size ;j++ ) {
				ans +=candy[j];
				System.out.println(candy[j]);
			}
			System.out.println(ans);
		}catch(Exception e){

		}
	}
}