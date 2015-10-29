import java.io.*;
import java.util.*;

public class gukiz{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String input = read.readLine();
			String []array= input.split(" ");
			int array1[] = new int[size];
			int array2[] = new int[2001];
			int max_index =0;
			for (int i=0;i<size ;i++ ) {
				array1[i] = Integer.parseInt(array[i]);
				int index= array1[i];
				array2[index] +=1;
				//System.out.println(index);
				if (index>max_index) {
				 	max_index = index;
				 } 
			}
			//System.out.println(max_index);
			int array3[] = new int[max_index+1];
			array3[max_index]= 1;
			for (int j=(max_index-1);j>=0;j-- ) {
				array3[j] = array3[j+1]+(array2[j+1]-1)+1;
				//System.out.println(array3[j]);
			}
			//System.out.println("fg");
			StringBuilder builder =new StringBuilder();
			for (int x : array1) {
				builder.append(array3[x]);
				builder.append(" ");
			}
			System.out.println(builder);
		}catch(Exception e){

		}
	}
}