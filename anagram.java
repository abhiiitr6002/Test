import java.io.*;
import java.util.*;

class anagram{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String first = read.readLine();
			String second = read.readLine();
			char array1[] = first.toCharArray();
			char array2[] = second.toCharArray();
			int arrayone[] = new int[array1.length];
			int arraytwo[] = new int[array2.length];
			int index1[] = new int[26];
			int index2[] = new int[26];
			int ans =0;
			for (int i=0;i<array1.length ;i++ ) {
				arrayone[i] = (int)array1[i];
				int index = arrayone[i]-97;
				index1[index] +=1;
			}
			for (int j=0;j<array2.length; j++ ) {
				arraytwo[j]= (int)array2[j];
				int index = arraytwo[j]-97;
				index2[index] +=1;
			}
			//for (int x :index2 ) {
			//	System.out.println(x);
			//}
			for (int k=0;k<26 ;k++ ) {
				if(index1[k]!=index2[k]){
					//System.out.println(diff);
					int diff =index1[k]-index2[k];
					int abs_diff = Math.abs(diff);
					//System.out.println(diff);
					ans +=abs_diff;
				}
				//System.out.println(ans);
			}System.out.println(ans);
		}catch(Exception e){

		}
	}
}