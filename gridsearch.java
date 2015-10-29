import java.io.*;
import java.util.*;

class gridsearch{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				String arr[] =  input.split(" ");
				int n=Integer.parseInt(arr[0]);
				String arr1[] = new String[n];
				for(int j=0;j<n;j++){
					String in = read.readLine();
					arr1[j] = in;
				}
				String inp = read.readLine();
				String arr2[]=inp.split(" ");
				int m = Integer.parseInt(arr2[0]);
				String arrchk[] = new String[m];
				for (int j=0;j<m;j++ ) {
					arrchk[j]=read.readLine();
				}
				boolean flag = false;
				int l=0;
				for (int k=0;k<n && !flag;k++ ) {
					if (arr1[k].contains(arrchk[l])) {
						l++;
					}else{
						l=0;
					}
					if(l==m+1){
						flag = true;
					}
				}
				if (flag) {
					list.add("YES");
				}else{
					list.add("NO");
				}
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}