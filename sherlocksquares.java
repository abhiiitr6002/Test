import java.io.*;
import java.util.*;

class sherlocksquares{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size;i++) {
				String input = read.readLine();
				String array[] = input.split(" ");
				int first =Integer.parseInt(array[0]);
				int second = Integer.parseInt(array[1]);
				double firstsqrt = Math.sqrt(first);
				int part_int = (int)firstsqrt;
				int first_part = 0;
				double rem = firstsqrt-(double)part_int;
				if(rem!=0.00){
					first_part = part_int+1;
				}else{
					first_part = part_int;
				}
				int second_sqrt = (int)Math.sqrt(second);
				int ans = second_sqrt- first_part+1;
				list.add(ans);
			}
			for (int x:list) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}