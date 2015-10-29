import java.io.*;
import java.util.*;

class acm{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String size=read.readLine();
			String []array =size.split(" ");
			int numberinput = Integer.parseInt(array[0]);
			int sizeinput = Integer.parseInt(array[1]);
			int output1=0;
			int output2=0;
			int highest=0;
			int outputcount=0;
			for (int i=0;i<(numberinput/2);i++) {
				String first = read.readLine();
				String second = read.readLine();
				char []firstinput = first.toCharArray();
				char []secondinput = second.toCharArray();
				//int array1[] = new int[sizeinput]; 
				//for (int j=0;j<sizeinput;j++) {
				//	array1[j]=-1;
				//}
				int count = 0;
				for (int k=0;k<sizeinput;k++) {
					if(firstinput[k]=='1'||secondinput[k]=='1'){
						count++;
					}
				}
				if (count==highest) {
					outputcount++;
				}else if(count>highest){
					outputcount=1;
					highest= count;
				}
			}
			System.out.println(highest);
			System.out.println(outputcount);
		}catch(Exception e){

		}
	}
}