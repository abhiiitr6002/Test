import java.io.*;
import java.util.*;

class lonely{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			int array[] = new int[size];
			String input = read.readLine();
			String []arrayone = input.split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			int []arraytwo = new int[101];
			int ans=0;
			for (int i=0;i<size;i++) {
				array[i]=Integer.parseInt(arrayone[i]);
			}
			for(int i=0;i<size;i++){
				int index = array[i];
				arraytwo[index] = arraytwo[index] +1;
				}
			for (int x=0 ;x<101;x++) {
				if(arraytwo[x]%2==1){
					ans =x;
				}
			}
			System.out.println(ans);
		}catch(Exception e){
			
		}
	}
}