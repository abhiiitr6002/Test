import java.io.*;
import java.util.*;

class taum_bday{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size =Integer.parseInt(read.readLine());
			ArrayList<Long> list = new ArrayList<Long>();
			for (int i=0;i<size ;i++ ) {
				String input1 =read.readLine();
				String array1[] = input1.split(" ");
				String input2 = read.readLine();
				String array2[] = input2.split(" ");
				Long black = Long.parseLong(array1[0]);
				Long white = Long.parseLong(array1[1]);
				Long x = Long.parseLong(array2[0]);
				Long y = Long.parseLong(array2[1]);
				Long z = Long.parseLong(array2[2]);
				Long ans= new Long(0);
				if (x>y) {
					ans = y*white;
					if ((y+z)>x) {
						ans += (x*black);
					}else{
						ans += (y+z)*black;
					}
				}else{
					ans = x*black;
					if ((x+z)>y) {
						ans +=(y*white);
					}else{
						ans +=(x+z)*white;
					}
				}
				list.add(ans);
			}
			for (Long x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}