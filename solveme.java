import java.io.*;
import java.util.*;

class solveme{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<size;i++){
				String input = read.readLine();
			    String []array = input.split(" ");
			    int sum =Integer.parseInt(array[0])+Integer.parseInt(array[1]);
			    list.add(sum);
			}
			for (int x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}