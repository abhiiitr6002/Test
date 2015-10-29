import java.io.*;
import java.lang.Math.*;
import java.util.regex.*;

 public class soldier{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			String array[] = input.split(" ");
			double k = Double.parseDouble(array[0]);
			double w = Double.parseDouble(array[2]);
			double money_required = w*(w+1);
			double sss = money_required/2;
			double money_posses = Double.parseDouble(array[1]);
			double ans = (sss*k)- money_posses;
			if (ans<0.0) {
				ans=0.0;
			}
			System.out.println((int)ans);
		}
		catch(Exception e){

		}
	}
}