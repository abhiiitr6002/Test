import java.io.*;
import java.util.*;

class loops{
	public static void main(String[] args) {
		try{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(read.readLine());
		ArrayList<String> list = new ArrayList<String>();
		for (int i=0;i<size ;i++ ) {
			String input = read.readLine();
			String []array = input.split(" ");
			int a =Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			int n = Integer.parseInt(array[2]);
			int array2[] = new int[n];
			double ans =0.0;
			for (int j=0;j<n ;j++ ) {
				double a_im = (double)a;
				ans += a_im + Math.pow(2,j)*(double)b;
				//System.out.println(ans);
				array2[j] =(int)ans;
			}
				StringBuilder builder = new StringBuilder();
                 for(int s : array2) {
                   builder.append(s);
                   builder.append(" ");
}
			//String ans1 = Arrays.toString(array2);
			//S//ystem.out.println(ans1);
			list.add(builder.toString());
		}
		for (String x :list ) {
			System.out.println(list.get(0));
		}
	}catch(Exception e){

	}
	}
}