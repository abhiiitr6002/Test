import java.io.*;
import java.util.*;

class bigger1{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<String> list = new ArrayList<String>();
			bigger1 obj = new bigger1();
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				char arr[] = input.toCharArray();
				int arr1[] = new int[arr.length];
				for (int j=0;j<arr.length ;j++ ) {
					arr1[j] = (int)arr[j];
				}
				//System.out.println("hi");
				int max = -1;
				int last = -1;
				for (int j=1;j<arr.length;j++ ) {
					if (arr1[j-1]<arr[j]) {
						max = j-1;
						last = j;
					}
					if (max >= 0) {
						if(arr1[max]<arr1[j]){
							last = j ;
					    }	
					}
				}
				//System.out.println("hi");
				if (max>(-1)) {
					int bet = arr1[max];
					arr1[max] = arr1[last];
					arr1[last] = bet;
					//System.out.println(max);
					String ans = obj.reverse(arr1,max+1);
					list.add(ans);
				}else{
					list.add("no answer");
				}
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
	public String reverse(int arr[],int n){
		int j=1;
		for (int i=n;i<(n+arr.length)/2 ;i++ ) {
			int bet = arr[i];
			arr[i] = arr[arr.length-j];
			arr[arr.length-j] = bet;
			j++;
		}
		char arr1[] = new char[arr.length];
		for (int k=0;k<arr.length ;k++ ) {
			arr1[k] = (char)arr[k];
		}
		String ans = new String(arr1);
		return ans;
	}
}