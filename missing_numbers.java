import java.io.*;
import java.util.*;

class missing_numbers{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size1 = Integer.parseInt(read.readLine());
			String input1 = read.readLine();
			String []array1 = input1.split(" ");
			int size2 = Integer.parseInt(read.readLine());
			String input2 = read.readLine();
			String [] array2 = input2.split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			for (String x :array2 ) {
				list1.add(Integer.parseInt(x));
			}
			Collections.sort(list1);
			int index =0;
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			for (int x :list1 ) {
				if (!list2.contains(x)) {
					list2.add(x);
				}
			}
		//	System.out.println("jk");
			index = list2.size();
			//System.out.println(index);
			int index1[] = new int[index];
			int index2[] = new int[index];
			for (int i=0;i<size1;i++ ) {
				int bet = list2.indexOf(Integer.parseInt(array1[i]));
				index1[bet] +=1;
			}
			for (int i=0;i<size2;i++ ) {
				int bet = list2.indexOf(Integer.parseInt(array2[i]));
				index2[bet] +=1;
			}
		//	System.out.println("jk");
			StringBuilder builder = new StringBuilder();
			for (int j=0;j<index;j++ ) {
				if ((index2[j]-index1[j])>0) {
					builder.append(list2.get(j));
					builder.append(" ");
				}
			}
			System.out.println(builder.toString());
		}catch(Exception e){

		}
	}
}