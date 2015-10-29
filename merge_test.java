import java.io.*;
import java.util.*;

class merge_test{
	public static void main(String[] args) {
		try{
			int arr[] = new int[]{9,6,8,5,9,10,1,9,3,8,5,18,72,14,2,1};
			int n= arr.length;
			merge_test obj = new merge_test();
			int arr1[]=obj.merge(arr,0,n-1);
			for (int i=0;i<n ;i++ ) {
				System.out.println(arr1[i]);
			}
		}catch(Exception e){

		}
	}
	public static int[] merge(int arr[],int l,int h){
		int n=h-l;
		if (n==1) {
			if (arr[l]>arr[h]) {
				int swap = arr[h];
				arr[h] =arr[l];
				arr[l]=swap; 
			}
		}
		if (n>0) {
	//		return arr[l];
		int m =(l+h)/2;
		   merge(arr,l,m);
		   merge(arr,m+1,h);
			
		}
		//int m =(l+h)/2;
		//return merge(arr,l,m);
	//	int m =(l+h)/2;
	//	   merge(arr,l,m);
	//	   merge(arr,m+1,h);
		   return arr;
	}
}