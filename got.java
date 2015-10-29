import java.io.*;
import java.util.*;

class got{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			String input = read.readLine();
			char array[] = input.toCharArray();
			int arraycopy[] = new int[array.length];
			for (int i=0;i<array.length;i++) {
				arraycopy[i]=(int)array[i];
			}
			int arrayindex[] = new int[26];
			for (int j=0;j<26;j++) {
				arrayindex[j]=-1;
			}
			for (int i=0;i<array.length;i++) {
				int x = arraycopy[i];
				int index=x-97;
				if(arrayindex[index]==-1){
					arrayindex[index]=1;
				}
				else{
					arrayindex[index]=-1;
				}
			}
			int count=0;
			for (int j=0;j<26;j++) {
				if(arrayindex[j]==1){
					count++;
				}		
			}
			if (count>1) {
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}catch(Exception e){

		}
	}
}