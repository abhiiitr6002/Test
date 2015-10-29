import java.io.*;
import java.util.*;

class alternating{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size;i++) {
				String input = read.readLine();
				char []array = input.toCharArray();
				int count=0;
				//System.out.println(array);
				//int ascii[]=new int[size];
				char var=array[0];
				for (int j=0;j<array.length ;j++) {
				
				if(array[j]!=var){
					array[j]='l';
					count++;
				}else{
					if (var=='A') {
						var='B';
					}else{
						var='A';
					}
				 }
				}
				list.add(count);
			}
			for (int x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}