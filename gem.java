import java.io.*;
import java.util.*;

class gem{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size =Integer.parseInt(read.readLine());
			String array[] = new String[size];
			for (int i=0;i<size;i++) {
				array[i]=read.readLine();
			}
			char []array1 =array[0].toCharArray();
			ArrayList<Integer> list = new ArrayList<Integer>();
			int ascii=array1[0];
			list.add(ascii);
			for(int j=1;j<array1.length;j++){
				int ascii1=(int)array1[j];
				if(!list.contains(ascii1)){
					list.add(ascii1);
				}
			}
			for (int k=1;k<size;k++) {
				//System.out.println("Hi");
				char []array2 = array[k].toCharArray();
				for (int l=0;l<list.size();l++ ) {
					int count=0;
					for (int m=0;m<array2.length;m++) {
						if(list.get(l)==(int)array2[m]){
							count++;
						}
					}
					if(count==0){
					list.remove(l);
					l=l-1;
				}
				}
			}
				System.out.println(list.size());
		}catch(Exception e){

		}
	}
}