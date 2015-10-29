import java.io.*;
import java.util.*;

class compounding{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			float p =Float.parseFloat(read.readLine());
			float r = Float.parseFloat(read.readLine());
			int t = Integer.parseInt(read.readLine());
			float bet = p;
			float ans = 0.0f;
			for (int i=0;i<t-1 ;i++ ) {
				float interest = (p*r)/1200;
				p =interest+p+bet;
				ans += interest;
			}
			ans +=p; 
			System.out.println("Final_Amount "+(int)ans);
		}catch(Exception e){
			System.out.println("Invalid Input");
		}
	}
}