import java.io.*;
import java.util.*;

class another_knap{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			String []arr = input.split(" ");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			int max = (n*(n+1))/2;
			if (m>max) {
				System.out.println(-1);
			}else{
				int bet = m;
				boolean flag = false;
				int count =0;
				int arr1[] = new int[n+1];
				for (int i=0;i<=n ;i++ ) {
					arr1[i]=i;
				}
				int net = n;
				int arrmax = arr1[n];
				//int count =0;
				while(!(bet<1)){
					//System.out.println(count);
					count++;
					//System.out.println(bet);
					if(m<=n ){
						if(bet == arr1[m]){
							bet = 0;
						}else{
							bet=bet- nearest(arr1,m);
							arr1[nearest(arr1,m)]=0;
							net--;
						}
						//flag = true;
					}else{
						bet = bet - arrmax;
						arr1[net] = 0;
						net--;
						arrmax = arr1[net];
					}
				}
				System.out.println(count);
			}
		}catch(Exception e){

		}
	}
	public static int nearest(int arr[],int n){
		while(arr[n]!=0){
			n--;
		}
		return n;
	}
}