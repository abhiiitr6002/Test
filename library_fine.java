import java.io.*;
import java.util.*;

class library_fine{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<Integer> list = new ArrayList<Integer> ();
			String input1 = read.readLine();
			String input2 = read.readLine();
			String arr1[] = input1.split(" ");
			String arr2[] = input2.split(" ");
			int yr1 = Integer.parseInt(arr1[2]);
			int yr2 = Integer.parseInt(arr2[2]);
			int mnt1 = Integer.parseInt(arr1[1]);
			int mnt2 = Integer.parseInt(arr2[1]);
			int dt1 = Integer.parseInt(arr1[0]);
			int dt2 = Integer.parseInt(arr2[0]);
			int fine =0;
			if (yr1>yr2) {
				fine=10000;
			}else if (mnt1>mnt2 && yr1==yr2) {
				int diff = mnt1-mnt2;
				fine = diff * 500;
			}else if(dt1>dt2 && mnt1 == mnt2){
				int diff = dt2-dt1;
				fine = diff *15;
			}
			System.out.println(Math.abs(fine));
		}catch(Exception e){

		}
	}
}