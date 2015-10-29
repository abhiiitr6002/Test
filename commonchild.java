import java.io.*;
import java.util.*;

class commonchild{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			String input1 = read.readLine();
			char arr[] = input.toCharArray();
			char arr1[] = input1.toCharArray();
			int array1[] = new int[26];
			int array2[] = new int[26];
			for(int i=0;i<arr.length;i++){
				int bet = (int)arr[i];
				bet = bet-65;
				array1[bet]++;
				int bet1 = (int)arr1[i];
				bet1 = bet1-65;
				array2[bet1]++;
			}
			int index =0;
			//System.out.println(array2[0]);
			for (int j=0;j<26;j++) {
				//System.out.println("hi");
				if (array1[j]>array2[j]) {
					//System.out.println("hi");
					index +=array2[j];
					//System.out.println(array2[j]);
				}else{
					index +=array1[j];
				//	System.out.println(index);
				}
			}
			if (index==arr.length) {
				index--;
			}
			System.out.println(index);
		}catch(Exception e){

		}
	}
}