import java.io.*;
import java.util.*;

class strange_grid{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			String []array = input.split(" ");
			long row = Long.parseLong(array[0]);
			Long column = Long.parseLong(array[1]);
			Long ans=new Long("0");
			if (row%2==0) {
				ans = (row*5) -(2*(6-column))+1;
			}
			else{
				ans = ((row+1) * 5)-(2*(6-column));
			}
			System.out.println(ans);
		}catch(Exception e){

		}
	}
}