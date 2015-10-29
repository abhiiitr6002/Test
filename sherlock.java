import java.io.*;
import java.util.*;

class sherlock{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size =Integer.parseInt(read.readLine());
			String []array={"0","z","y","x","w","v","u","t","s","r","q","p","o","n","m","l","k","j","i","h","g","f","e","d","c","b","a"};
			ArrayList list1 =new ArrayList(size);
			//System.out.println(array[26]);
			for (int i=0;i<size;i++) {
				String input = read.readLine();
				char array1[] = input.toCharArray();
				//int array2[] = new int[(array1.length+1)/2];
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int j=0;j<array1.length;j=j+2){
					int tens=Character.getNumericValue(array1[j]);
					int digit = Character.getNumericValue(array1[j+1]);
					int number = tens*10+digit;
					list.add(number);
					System.out.println(list.size());
				}
				System.out.println(list.size());
					String ans[] =new String[list.size()];
				for (int k=0;k<list.size();k++ ) {
					//System.out.println("Hi");
				
					ans[k]= array[list.get(k)];
					
				}
				System.out.println(ans);
			}
		}catch(Exception e){}
	}
}