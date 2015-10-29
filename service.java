import java.io.*;
import java.util.*;

class service{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String first_line = read.readLine();
			String array[] = first_line.split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			int length = Integer.parseInt(array[0]);
			int size_testcases = Integer.parseInt(array[1]);
			String inputarray = read.readLine();
			String mainarray[] = inputarray.split(" ");
			int intarray[] = new int[length];
			//System.out.println("Hi");
			for (int i=0;i<length;i++ ) {
				intarray[i]=Integer.parseInt(mainarray[i]);
			}
			//System.out.println("Hi");
			for(int j=0;j<size_testcases;j++){
				String input = read.readLine();
				String array2[] = input.split(" ");
				int first =Integer.parseInt(array2[0]);
				int last = Integer.parseInt(array2[1]);
				//System.out.println("hi");
				int ans=vechile(first,last,intarray);
				list.add(ans);
			}
			for (int x:list) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
	public static int vechile(int i,int j,int array[]){
		int minn=3;
		//System.out.println("hi");
		//return maxx;
		for(int l=i;l<=j;l++){
			if(minn>array[l]){
				minn=array[l];
			}
		}
		//System.out.println(maxx);
		return minn;
	}
}