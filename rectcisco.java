import java.io.*;
import java.util.*;

class rectcisco{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			String input1 = read.readLine();
			String []arr = input.split(" ");
			String []arr1 = input1.split(" ");
			int arr3[] = new int[4];
			int arr4[] = new int[4];
			for (int i=0;i<4;i++ ) {
				arr3[i]= Integer.parseInt(arr[i]);
				arr4[i] =Integer.parseInt(arr1[i]);
			}
			boolean flag = true;
			if (arr4[0]>arr3[2]||arr3[0]>arr4[2]) {
				flag = false;
			}else if (arr3[1]<arr4[3]||arr4[1]<arr3[3]) {
				flag = false;
			}
			if (flag) {
				System.out.println("overlap");
			}else{
				System.out.println("no overlap");
			}
		}catch(Exception e){

		}
	}
}