import java.io.*;
import java.util.*;

class bigger{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				char array[] = input.toCharArray();
				int array1[] = new int[array.length];
				boolean flag= false;
				int index = 0;
				String output1 =" ";
				for (int j=0;j<array.length ;j++ ) {
					array1[j] = (int)array[j];
				}
				int last = array1[array.length-1];
				//System.out.println("Hi");
				for (int p=(array.length-2);p>=0 && !flag ;p-- ) {
					if (array1[p]<last) {
						//System.out.println("Hi");
						flag = true;
						index = p;
						break;
					}
				}
				if(flag){
				//System.out.println(index);
				int swap =  array1[array.length-2];
				array1[array.length-2] = array1[array.length-1];
				array1[array.length-1] = swap;
				//for (intl=; ; ) {
				//	
				//}
				//System.out.println(swap);
				for (int j=0;j<array.length ;j++ ) {
					array[j] = (char)array1[j];
				}
				String output = new String(array);
				output1 =output;
			}
			//System.out.println(flag);
				if (flag) {
					list.add(output1);
				}else{
					//System.out.println("flag");
					list.add("no answer");
				}
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}