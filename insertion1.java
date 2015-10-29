import java.io.*;
import java.util.Arrays;

class insertion1{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String input = read.readLine();
			String []org_array = input.split(" ");
			int []array = new int[size];
			for (int i=0;i<size;i++ ) {
				array[i] = Integer.parseInt(org_array[i]);
			}
			insertion1 obj = new insertion1();
			int final_array[] = obj.sort(array);
			for (int x:final_array ) {
			System.out.print(x+" ");

			}
		}catch(Exception e){

		}
	}

	public int[] sort(int array[]){
		int value = array[array.length-1];
		int i =array.length-2;
		while(array[i]>=value){
			if (array[i]>value) {
				array[i+1] = array[i];
			}else{
				array[i+1]=value;
			}
			for (int x:array ) {
			System.out.print(x+" ");

			}
			System.out.println("");
			//System.out.println(Arrays.toString(array));
			if (i>=1) {
				i--;
			}else{
				i--;
				break;
			}
			
		}
		if(i>=0){
			//System.out.println(i);
		array[i+1]=value;
	}else{
		//System.out.println(i);
		array[0]=value;
	}
		return array;
	}
}