import java.io.*;
import java.util.*;
import java.math.*;

class compounding{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			float p =Float.parseFloat(read.readLine());
			float r = Float.parseFloat(read.readLine());
			int t = Integer.parseInt(read.readLine());
			BigDecimal bet = new BigDecimal(Float.toString(p));
			BigDecimal ans1 = new BigDecimal("0");
			BigDecimal prin = new BigDecimal("0.0");
			prin = prin.setScale(11);
			BigDecimal rate = new BigDecimal(Float.toString(r));
			int count =0;
			//MathContext mc1 = new MathContext(0,RoundingMode.HALF_UP);
			for (int i=0;i<t ;i++ ) {
				prin = prin.add(bet);
				//if (count==12) {
				//	count=0;
				//	prin = prin.add(ans1);
				//}
				BigDecimal dev = new BigDecimal("1200");
				MathContext mc = new MathContext(11);
				BigDecimal interest = prin.multiply(rate,mc);
				BigDecimal interest1 = interest.divide(dev,11,RoundingMode.CEILING);
				//String bet1 = Double.toString(interest);
				//BigDecimal bet1 = new BigDecimal(Float.toString(interest));
				//BigDecimal bet2 = bet1.setScale(11);
				//String bet2 = String.format("%.11f");'
				//count++;
				//f interest1 = bet2.floatValue();;
				//System.out.println(interest1);
				//prin = prin.add(bet);
				prin = prin.add(interest1);
				//ans1= ans1.add(interest1);
				//p =+p+bet;
				//ans += interest1;
			}
			//prin = prin.add(ans1);
			//BigDecimal ans2 = prin.round(mc1);
			BigDecimal ans2 = prin.setScale(0, RoundingMode.HALF_DOWN);
			long ans = ans2.longValue();
			//ans +=p; 
			System.out.println("Final_Amount "+ans);
		}catch(Exception e){
			System.out.println("Invalid Input");
		}
	}
}