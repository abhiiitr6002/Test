import java.io.*;
import java.util.*;

class hurdels{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size=Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size;i++) {
				String input = read.readLine();
				String array[] = input.split(" ");
				int arr[] = new int[array.length];
				int count=1;
				for (int j=0;j<array.length;j++) {
					arr[j] =Integer.parseInt(array[j]);
				}
				for (int k=2;k<array.length;k++) {
					if(arr[k-1]<arr[k]){
						count++;
					}
					else{
						break;
					}
				}
				list.add(count);
			}
			for (int x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}