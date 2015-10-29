import java.io.*;
import java.util.*;

class dance{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String in1 =read.readLine();
			String arr[] = in1.split(" ");
			int n = Integer.parseInt(arr[0]);
			int k= Integer.parseInt(arr[1]);
			String in2 = read.readLine();
			String in3 = read.readLine();
			String arr1[] = in2.split(" ");
			String arr2[] = in3.split(" ");
			int boys[] = new int[n];
			int girls[] = new int[n];
			for (int i=0;i<n;i++ ) {
				boys[i] = Integer.parseInt(arr1[i]);
				girls[i] = Integer.parseInt(arr2[i]);
			}
			int ans =0;
			for (int i=0;i<n ;i++ ) {
				boolean flag = true;
				int diff_min = 0;
				int bh = boys[i];
				int diff_index = -1;
				for (int j=0;j<n ;j++ ) {
					int diff = Math.abs(girls[j]-bh);
					if (diff<=k) {
						ans++;
						if (diff_min<diff) {
							diff_min =diff;
							diff_index = j;
						}
						flag =false;
					}
				}
				if (flag = false) {
						girls[diff_index] = Integer.MAX_VALUE;
					}
			}
			System.out.println(ans);
		}catch(Exception e){

		}
	}
}