import java.io.*;
import java.util.*;

class arena{
	public static void main(String[] args) {
		try{
			BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
			ArrayList<String> list = new ArrayList<String>();
			int size = Integer.parseInt(read.readLine());
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				String arr[] = input.split(" ");
				int f = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				int t = Integer.parseInt(arr[2]);
				int fd = Integer.parseInt(arr[3]);
				int bd = Integer.parseInt(arr[4]);
				if (f==b) {
					/*if (f==fd) {
						int time = t*fd*2 + t*bd;
						StringBuilder ans = new StringBuilder();
						ans.append(Integer.toString(time));
						ans.append(" ");
						ans.append("F");
						list.add(ans.toString());
					}else if (b==bd) {
						int time = t*bd*2 + t*fd;
						StringBuilder ans = new StringBuilder();
						ans.append(Integer.toString(time));
						ans.append(" ");
						ans.append("B");
						list.add(ans.toString());
					}*/
					if (b>=bd) {
						int time = t*bd;
						StringBuilder ans = new StringBuilder();
						ans.append(Integer.toString(time));
						ans.append(" ");
						ans.append("B");
						list.add(ans.toString());
					}else if (f>=fd) {
						int time = t*(fd+b) ;
						StringBuilder ans = new StringBuilder();
						ans.append(Integer.toString(time));
						ans.append(" ");
						ans.append("F");
						list.add(ans.toString());
					}else{
						list.add("Thank God");
					}
				}else if (b>f) {
					if (b>bd) {
						int time = t*bd;
						StringBuilder ans = new StringBuilder();
						ans.append(Integer.toString(time));
						ans.append(" ");
						ans.append("B");
						list.add(ans.toString());
					}else{
						//int count =0;
						int cost =0;
						StringBuilder ans = new StringBuilder();
						int diff = b-f;
						int rem = bd - b;
						int pre = rem%diff;
						if (pre==0) {
							int turnf =rem/diff;
							cost = turnf*t*f + (turnf+1)*b*t;
						}else{
							int turnf= rem/diff;
							cost = (turnf+1)*t*f + (turnf+1)*b*t + (b+pre-diff)*t;
						}
						ans.append(Integer.toString(cost));
						ans.append(" ");
						ans.append("B");
						list.add(ans.toString());
					}
				}else if(b<f){
					if (b>bd) {
						int time = t*bd;
						StringBuilder ans = new StringBuilder();
						ans.append(Integer.toString(time));
						ans.append(" ");
						ans.append("B");
						list.add(ans.toString());
					}
					else if (f>fd) {
						int time = t*(fd+b);
						StringBuilder ans = new StringBuilder();
						ans.append(Integer.toString(time));
						ans.append(" ");
						ans.append("F");
						list.add(ans.toString());
					}else{
						int count =0;
						int cost =0;
						StringBuilder ans = new StringBuilder();
						int diff = f-b;
						//int rem = fd - f;
						int pre = fd%diff;
						if (pre==0) {
							int turnf =fd/diff;
							cost = turnf*t*f + (turnf)*b*t;
						}else{
							int turnf= fd/diff;
							cost = (turnf)*t*f + (turnf+1)*b*t + (f+pre-diff)*t;
						}
						ans.append(Integer.toString(cost));
						ans.append(" ");
						ans.append("F");
						list.add(ans.toString());
					}
				}
			}
			for (String x : list) {
				System.out.println(x);
			}
		}catch(Exception e){}
	}
}