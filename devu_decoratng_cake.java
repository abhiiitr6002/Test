import java.io.*;
import java.util.*;

class devu_decoratng_cake{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i< size;i++ ) {
				String input = read.readLine();
				ArrayList<Character> list1 = new ArrayList<Character>();
				char []array= input.toCharArray();
				int size_array = array.length;
				boolean flag = false;
				int max=0;
				int max_index = -1;
				int arrayone[] = new int[26];
				for (int j=0;j<size_array;j++ ) {
					int index = (int)array[j] -97;
					arrayone[index] += 1;
					//System.out.println("hi");
				}
				for (int k=0;k<26;k++ ) {
					//System.out.println(arrayone[k]);
					if (arrayone[k]>(size_array/2)+1) {
						flag = true;
					}
					if (size_array==2) {
					if (arrayone[k]>(size_array/2)) {
						flag = true;
					}
				}
					if (arrayone[k]>max) {
						max = arrayone[k];
						max_index= k;
					}
				}
				for (int z=0;z<max;z++ ) {
					list1.add((char)(max_index+97));
				}
				arrayone[max_index] = 0;
				int l=0;
				int q=1;
				for (int p=0;p<26 ;p++ ) {
					
					if (q>list1.size()) {
						q= l+1;
						l++;
					}
					if (arrayone[p]>0) {
						for (int f=0;f<arrayone[p]; f++) {
							list1.add(l+q,(char)(p+97));
							q+=2;
						}
						
					}
				}
				Iterator<Character> it = list1.iterator();
                StringBuilder sb = new StringBuilder();

                  while(it.hasNext()) {
                  sb.append(it.next());
                 }
                 if(flag){
                 	list.add("-1");
                 }else{
                 list.add(sb.toString());
             }
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}