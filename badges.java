import java.io.*;
import java.util.regex.*;

public class badges{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String input = read.readLine();
			String array[] = input.split(" ");
			int arrayone[] = new int[size]; 
			int arraytwo[] = new int[3001];
			int money =0;
			for (int i=0;i<size;i++ ) {
				arrayone[i] = Integer.parseInt(array[i]);
				int index = arrayone[i];
				arraytwo[index] = arraytwo[index] +1;
			}
			for (int j=0;j<3001 ;j++ ) {
				if (arraytwo[j]>1) {
					int diff = arraytwo[j]-1;
					int k =1;
					//money = money + diff;
					//System.out.println(diff);
					while(diff>0){
						//System.out.println(diff);
						money++;
						if (arraytwo[j+k]==0) {
							arraytwo[k+j]=arraytwo[k+j]+1;
							diff--;
						}
						k++;
					}
				}
			}
			System.out.println(money);
		}
		catch(Exception e){

		}
	}
}