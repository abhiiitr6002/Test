import java.io.*;
import java.util.*;

class sherlockbeast{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i<size ;i++ ) {
				int ans=0;
				int input = Integer.parseInt(read.readLine());
				int n=0;
				int m=0;
				if (input%3==0) {
					n = input/3;
				}else if(input==5){
					m = 1;

				}else{
					if (input%3==2 && input>6) {
						n=input/3;
						n=n-1;
						m++;
					}else if (input%3==1 && input>9) {
						n = input/3;
						n = n-3;
						m =m+2;
					}
				}
				StringBuilder build = new StringBuilder();
				if (n==0&&m==0) {
					list.add("-1");
				}else{
					for (int j=0;j<(n*3) ;j++ ) {
						build.append("5");
					}
					for (int k=0;k<(m*5) ;k++ ) {
						build.append("3");
					}
					list.add(build.toString());
				}
			}
			for (String x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}