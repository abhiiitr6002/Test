import java.io.*;
import java.util.*;

class cavity{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			char arr2d[][]  = new char[size][size];
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				char arr[] = input.toCharArray();
				for(int j=0;j<size;j++){
					arr2d[i][j] = arr[j];
				}
			}
			for (int i=1;i<(size-1) ;i++ ) {
				for (int j=1;j<size-1 ;j++ ) {
					if (arr2d[i-1][j]<arr2d[i][j] && arr2d[i][j-1]<arr2d[i][j] && arr2d[i+1][j]<arr2d[i][j] && arr2d[i][j+1]<arr2d[i][j]) {
						arr2d[i][j] ='x';
					}
				}
			}
			for (int i=0;i<size ;i++ ) {
				for (int j=0;j<size ;j++ ) {
					System.out.printf("%c",arr2d[i][j]);
				}
				System.out.println();
			}
		}catch(Exception e){

		}
	}
}