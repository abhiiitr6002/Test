import java.io.*;

class intro{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int key =Integer.parseInt(read.readLine());
			int size =Integer.parseInt(read.readLine());
			String array = read.readLine();
			String []str_array = array.split(" ");
			int []array1 = new int[str_array.length];
			for (int i=0;i<str_array.length;i++ ) {
				array1[i]=Integer.parseInt(str_array[i]);
			}
			intro obj = new intro();
			int ans = obj.binary(key,0,array1.length-1,array1);
			System.out.println(ans);
		}catch(Exception e){
			
		}
	}
	public int binary(int key,int first,int last,int [] array){
		int index = (first+last)/2;
		if (array[index]==key) {
			return index;
		}else if(array[first]==key){
			return first;
		}else if(array[last]==key){
			return last;
		}else{
			if (array[index]>key) {
				return binary(key,first,index,array);
			}else{
				return binary(key,index,last,array);
			}
		}
	}
} 