import java.io.*;
import java.util.*;

class encryption{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			char []array = input.toCharArray();
			double root = Math.sqrt(array.length);
			int row =(int)Math.ceil(root);
			String ans = null;
			StringBuilder builder1 = new StringBuilder();
			//ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i<row ;i++ ) {
				StringBuilder builder = new StringBuilder();
			for (int j=i;j<array.length ;j+=row ) {	
				builder.append(array[j]);
				}
				builder1.append(builder.toString());
				builder1.append(" ");				//list.add(builder.toString());
				//list.add(" ");

			}
			System.out.println(builder1.toString());
		}catch(Exception e){

		}
	}
}