import java.util.*;
import java.io.*;

class tcssorting{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			tcssorting obj = new tcssorting();
			ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i<size;i++ ) {
				String input = read.readLine();
				int loop = Integer.parseInt(read.readLine());
				String arr[] = input.split(" ");
				int arrint[] = new int[arr.length/2];
				String arrs[] = new String[arr.length];
				for (int j=0;j<arr.length ;j = j+2 ) {
					arrs[j/2] = arr[j];
					arrint[j/2] = Integer.parseInt(arr[j+1]);
				}
				int strsort = loop/2 + loop%2;
				int intsort = loop/2;
				String arr1[] = obj.insertstr(arrs,strsort);
				int arr2[] = obj.insertint(arrint,intsort);
				String ans[] = new String[arr.length];
				StringBuilder build = new StringBuilder();
				for (int k=0;k<arr.length ;k=k+2) {
					ans[k]=arr1[k/2];
					ans[k+1] =Integer.toString(arr2[k/2]);
					build.append(arr[k]);
					build.append(ans[k+1]);
				}
				list.add(build.toString());
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
	public String[] insertstr(String arrs[],int n){
		for (int j = 1; j < n; j++) { //the condition has changed
     String key = arrs[j];
    int i = j - 1;
    while (i >= 0) {
      if (key.compareTo(arrs[i]) > 0) {//here too
        break;
      }
      arrs[i + 1] = arrs[i];
      i--;
    }
    arrs[i + 1] = key;
	}
	return arrs;
    }

    public int[] insertint(int arr[],int n){
    	for (int j=0;j<n ;j++ ) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
    	}
    	return arr;
    }
}