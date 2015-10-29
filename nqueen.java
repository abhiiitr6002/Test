/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class nqueen
{
	public static void main (String[] args)
	{
		// your code goes her
		int n=4;
		int arr[][] = new int[n][n];
		if(n>3){
		nqueen obj = new nqueen();
		int array[][] = new int[n][n];
		//int arr[][] = new int[n][n];
		arr = obj.queen(0,array,n);
		}else{
			System.out.println("No Solution Possible");
		}
		for (int i=0 ;i<n;i++ ) {
			for(int j=0;j<n;j++){
				System.out.printf("%d",arr[i][j]);
			}
			System.out.println(" ");
		}
	}
	public int[][] queen(int n, int arr[][],int m){
		//int arr[][] = new int[n][n];
		if(n>=m){
			return arr;
		}
		//if(i>m){
		//	arr[][] = queen(n-1,arr[][],m);
		//}
		int i=0;
		boolean flag1 = false;
		while(!flag1){
			if (check(arr,i,n,m)) {
				arr[i][n]=1;
				flag1 = true;
			}
			i++;
			if (!flag1 && i==m) {
				return queen(n-1,arr,m);
			}
		}
		return queen(n+1,arr,m);		
	}
	public boolean check(int arr[][],int i,int n,int m){
		//if (i>m || n>m ) {
		//	return false;
		//}
		boolean flag = true;
		for(int j=0;j<i;j++){
			if(arr[i][j]==1){
				flag = false;
			}
		}
		if(flag){
			for(int j=0;j<n;j++){
				if(arr[j][n]==1){
					flag = false;
				}
			}
			int bet1 =0;
			int bet2=0;
			int bet3 =0;
			int bet4 =0;
			if(i>=n){
				bet1 = i-n;
				//bet2=0;
				//hile()
			}else{
				bet2 = n-i;
			}
			while(bet1<m && bet2<m){
				if(arr[bet1][bet2]==1){
					flag = false;
				}
				bet1++;
				bet2++;
			}
		}
		return flag;
	}
}