import java.io.*;
import java.util.*;

class two_string{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<String> list  = new ArrayList<String>();
			for (int i=0;i<size ;i++ ) {
				String first = read.readLine();
				String second = read.readLine();
				char array1[] = first.toCharArray();
				char array2[] = second.toCharArray();
				int index1[] = new int[26];
				int index2[] = new int[26];
				boolean flag = false;
				//System.out.println(array1.length);
				for (int j=0;j<array1.length ;j++ ) {
					//System.out.println("Hi");
					int index = (int)array1[j];
					index1[index-97] +=1; 
					//System.out.println("Hi");
				}
				for (int j=0;j<array2.length ;j++ ) {
					int index = (int)array2[j] ;
					index2[index-97] +=1; 
					//System.out.println("Hi");
				}
				for (int k=0;k<26 ;k++ ) {
					if((index1[k]>0 )&& (index2[k]>0)){
						//System.out.println("Hi");
	                   flag = true;
	                  // break;
                    }
				}
				if (flag) {
					list.add("YES");
				}else{
					list.add("NO");
				}
			}
			for (String x : list) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}