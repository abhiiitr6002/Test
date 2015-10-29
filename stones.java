import java.io.*;
import java.util.*;

class stones{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size =Integer.parseInt(read.readLine());
			ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i<size;i++) {
				int no_stones = Integer.parseInt(read.readLine());
				int a = Integer.parseInt(read.readLine());
				int b = Integer.parseInt(read.readLine());
				int common = (b-a);
				int start = a*(no_stones-1);
				//if(((b-a)%(no_stones-1))!=0){
				//	common = common+1;
				//}
				String space =" ";
				//list.add(Integer.toString(start));
				String addstring = Integer.toString(start)+space;
				for (int j =1;j<no_stones;j++) {
					addstring=addstring+Integer.toString(start+common)+space;
					start =start+common;
				}
				list.add(addstring);
			}
			for (String x:list ) {
				System.out.println(x);
			}

		}catch(Exception e){

		}
	}
}