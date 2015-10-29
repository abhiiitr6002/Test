import java.io.*;
import java.util.*;

class sticks{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String input = read.readLine();
			String array[]=input.split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			int array1[] =new int[size];
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			for (int i=0;i<array.length;i++) {
				//System.out.println(array[i]);
				array1[i]=Integer.parseInt(array[i]);
			}
			//Collections.sort(list);
	//		for (int x :list) {
	//		System.out.println(x);S
			for (int k=0;k<(size-1);k++ ) {
				int index =0;
				int min = array1[k];
				for (int l=k;l<size;l++ ) {
					if(min>array1[l]){
						min=array1[l];
						index = l;
					} 
				}
				int swap=array1[k];
					array1[k]=min;
					array1[index]=swap;
			}
			for (int i=0;i<array.length;i++) {
				//System.out.println(array[i]);
				//array1[i]=Integer.parseInt(array[i]);
				list.add(array1[i]);
			}
	//	}
			while(list.size()!=0){
			for (int j=0;j<list.size();j++) {
				int min = list.get(0);
				int repl=list.get(j)-min;
				list.add(j,repl);
			}
			list1.add(list.size());
			//while(list.contains(0)){
				list.remove(new Integer(0));
			//}
		}
		for (int x :list1) {
			System.out.println(x);
		}
		}catch(Exception e){
			System.out.println("error");
		}
	}
}