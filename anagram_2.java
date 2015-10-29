import java.io.*;
import java.util.*;

class anagram_2{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size =Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				char array[] = input.toCharArray();
				boolean flag = false;
				int index1[] = new int[26];
			    int index2[] = new int[26];
			    int ans =0;
				if (array.length%2!=0) {
					flag = true;
					//System.out.println("HI");
				}else{
					//System.out.println(array.length);
					int array1[] = new int[(array.length/2)];
					int array2[] = new int[array.length/2];
					for (int j=0;j<array1.length ;j++ ) {
						//System.out.println("HI");
						array1[j] = (int)array[j];
						array2[j] = (int)array[j+array1.length];	
						index1[array1[j]-97] +=1;
						    index2[array2[j]-97] +=1;				        
						}
						for (int k=0;k<26 ;k++ ) {
							
						     if (index1[k]!=index2[k]) {
							//System.out.println("HI1");
							int diff =index1[k]-index2[k];
					       // int abs_diff = Math.abs(diff);
					       // System.out.println(diff);
					        if (diff>0) {
					        	ans += diff;
					        }
						}
					}
				}
				if (flag) {
					list.add(-1);
				}else{
					list.add(ans);
				}
			}
			for (int x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}