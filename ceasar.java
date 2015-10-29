import java.io.*;
import java.util.*;

class ceasar{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String input = read.readLine();
			int k= Integer.parseInt(read.readLine());
			char arr[] = input.toCharArray();
			for (int i=0;i<size ;i++ ) {
				int test = (int)arr[i];
				if (test>=65 && test<=90) {
					test +=k;
					if(test>90){
						while(test>90){
							int diff= test-90;
					        test = 64+diff;
						}
					}
					arr[i] = (char)test;
				}else if(test>=97 && test<=122){
					test +=k;
					if (test>122) {
						while(test>122){
						int diff = test-122;
						test = 96+diff;
						}
					}
					arr[i] = (char)test;
				}
			}
			String ans = new String(arr);
			System.out.println(arr);
		}catch(Exception e){

		}
	}
}