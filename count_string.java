import java.io.*;
import java.util.*;

class count_string{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<String> list1  = new ArrayList<String>();
			for (int i=0;i<size ;i++ ) {
				String input1 = read.readLine();
				String input2 = read.readLine();
				String array1[] = input1.split(" ");
				int k = Integer.parseInt(array1[1]);
				int n = Integer.parseInt(array1[0]);
				char []array2 = input2.toCharArray();
				//int arraytwo[]  = new int[n];
				int index[] = new int[26];
 				for (int j=0;j<n ;j++ ) {
					int ascii = (int)array2[j];
					int index_array = ascii - 97;
					index[index_array] +=1; 
				}
				char array_par[] = new char[26];
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int l=0;l<26 ;l++ ) {
					if (index[l]>k) {
						list.add(index[l]);
						array_par[list.size()-1] = (char)(l+97);
					}
				}
				if (list.size()==0) {
					list1.add("NONE");
				}else{
					StringBuilder builder = new StringBuilder();
					boolean flag =true;
					count_string obj = new count_string();
					while(flag){
					int ans = obj.find_max(list);
					if (ans ==-1) {
						list1.add(builder.toString());
						flag =false;
					}else{
						builder.append(array_par[ans]);
						list.set(ans,-1);
					}
				}
				}
			}
			for (String x :list1 ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
	public int find_max(ArrayList<Integer> list){
		int max = 0;
		int max_index = -1;
		for(int j=0;j<list.size();j++){
			if (list.get(j)>=max) {
				max = list.get(j);
				max_index =j;
			}
		}
		return max_index;
	}
}