import java.util.*;
import java.io.*;

class mangalyaan{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size;i++) {
				String f_line =read.readLine();
				String arr[] = f_line.split(" ");
				int arr_size = Integer.parseInt(arr[0]);
				int threshold = Integer.parseInt(arr[1]);
				int array[] = new int[arr_size];
				String input_arr = read.readLine();
				String arr_2[] = input_arr.split(" ");
				int count=0;
				for (int j=0;j<arr_size;j++) {
					array[j]=Integer.parseInt(arr_2[j]);
					if(array[j]>=threshold){
						count++;
					}
				}
				list.add(count);
			}
			for (int x :list) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}