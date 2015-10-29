import java.io.*;
import java.util.*;
import java.lang.*;

class filling_jars{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input1 = read.readLine();
			String array[] = input1.split(" ");
			int size = Integer.parseInt(array[1]);
			Long array_size = Long.parseLong(array[0]);
			Long ans = new Long("0");
			for (int i=0;i<size ;i++ ) {
				String input2 = read.readLine();
				String []array1 = input2.split(" ");
				Long first = Long.parseLong(array1[0]);
				Long second = Long.parseLong(array1[1]);
				Long factor = Long.parseLong(array1[2]);
				Long diff =second-first+1;
				Long ja =diff * factor;
				//Long l = ja.longValue();
				ans = ans + ja;
			}
			
			long final_ans = ans /array_size;
			System.out.println(final_ans);
		}
		catch(Exception e){

		}
	}
}