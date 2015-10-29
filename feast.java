import java.io.*;
import java.util.*;

class feast{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size;i++) {
				String input =read.readLine();
				String array[] = input.split(" ");
				int amount=Integer.parseInt(array[0]);
				int cost = Integer.parseInt(array[1]);
				int wrapper = Integer.parseInt(array[2]);
				int total = amount/cost;
				int extra = amount%2;
				total = total +(total/wrapper);
				int rmain_wrapper=extra+(total/wrapper)+total%wrapper;
				//int add = rmain_wrapper/wrapper;
					//total = total +add;
					//rmain_wrapper = rmain_wrapper +(total/wrapper);
				//System.out.println(rmain_wrapper);
				//System.out.println(rmain_wrapper);
				while(rmain_wrapper>=wrapper){
					//System.out.println("Hi");
					int add = rmain_wrapper/wrapper;
					total = total +add;
					rmain_wrapper = add +(rmain_wrapper%wrapper);
				}
				list.add(total);
			}
			for (int x:list) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}