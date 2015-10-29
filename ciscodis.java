import java.io.*;
import java.util.*;

class ciscodis{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String input = read.readLine();
			String arr[] =input.split(" ");
			ArrayList<Integer> list =  new ArrayList<Integer>();
			for (int i=0;i<size ;i++ ) {
				list.add(Integer.parseInt(arr[i]));
			}
			Collections.sort(list);
			int max = list.get(list.size()-1);
			int min = list.get(0);
			int med = max+min;
			if (med%2==0) {
				med = med/2;
			}else{
				med = med/2 +1;
			}
			int ans =0;
			int anx =1000000;
			int ans2 = 0;
			for (int x :list ) {
			//	if (med>x ){
			//		ans2 = med-x;
			//	}
				if(Math.abs(x-med)<=anx){
					anx = Math.abs(x-med);
					ans = x;
				}
			}
		//	if((list.get(list.size()/2))<med){
		//		ans =ans2;
		//	}
			System.out.println(ans);
		}catch(Exception e){

		}
	}
}