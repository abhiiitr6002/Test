import java.io.*;
import java.util.*;

public class two_substring{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			String []array_test = input.split("AB");
			String []array_test1 = input.split("BA");
			String []array_test2 = input.split("ABA");
			String ans =null;
			ArrayList<String> list =  new ArrayList<String>();
			if (array_test.length>1 && array_test1.length>1) {
				if (input=="ABA") {
					ans = "NO";
				}else if(array_test2.length==2){
					if (array_test1.length==2 &&array_test.length==2) {
						if (input.charAt(0)=='A'&&input.charAt(1)=='B') {
							if (input.charAt(input.length()-1)=='B' && input.charAt(input.length()-2)=='A') {
								ans = "YES";
							}else{
								ans = "NO";
							}
						}else if (input.charAt(0)=='B'&&input.charAt(1)=='A') {
							if (input.charAt(input.length()-1)=='A' && input.charAt(input.length()-2)=='B') {
								ans = "YES";
							}else{
								ans = "NO";
							}
						}
						else{
							ans="NO";
						}
					}else{
						ans="YES";
					}
				}else {
					ans = "YES";
				}
			}else{
				ans="NO";
			}
			System.out.println(ans);
		}catch(Exception e){

		}
	}
}