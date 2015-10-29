import java.util.*;
import java.io.*;

class digits{
	public static void main(String[] args) {
		try{
			BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			for(int i=0;i<size;i++){
				ArrayList<Integer> list = new ArrayList<Integer>();
				int input = Integer.parseInt(read.readLine());
				int input1 = input;
				int count=0;
				do{
					int rem =input%10;
					input=input/10;
					list.add(rem);
					//System.out.println(rem);
				}while(input/10!=0);
				int rem =input%10;
					input=input/10;
					list.add(rem);
					//for (int x:list) {
				//System.out.println(x);
			//}
				for (int j=0;j<list.size();j++) {
					//System.out.println(input1/list.get(j));
					if(list.get(j)!=0){
					if(input1%list.get(j)==0){
						count++;
						//System.out.println("hi");
					}
				}
				}
				list1.add(count);
			}
			for (int x:list1) {
				System.out.println(x);
			}
		}
		catch(Exception e){
			
		}
	}
}