import java.io.*;

class insertion2{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String input = read.readLine();
			String org_array[] = input.split(" ");
			int array[] = new int[size];
			for (int j=0;j<size ;j++ ) {
				array[j] = Integer.parseInt(org_array[j]);
			}
			insertion2 obj = new insertion2();
			int final_array[] = obj.sort(array);
			for (int x : final_array) {
				System.out.print(x+" ");
			}
		}catch(Exception e){

		}
	}

	public int[] sort(int array[]){
		int value = 0;
		boolean status = false; 
		for (int i=1;i<array.length ;i++ ) {
			value = array[i];
			int j=i-1;
		    if (array[i]>array[i-1]) {
		    	//System.out.println("hello2");
					//break;
			}else{
				while(j>=0){
					System.out.println("hello");
					if (array[j]>value) {
						int bet = array[j];
						array[j+1]= array[j];
						array[j] = value;
						//System.out.println("hello1");
					}else {
						//array[j]=value;
					}
						j--;
					}
					if (j==(-1)) {
						array[0] = value;
						break;
					}
			}
			for (int x:array) {
				System.out.print(x+" ");
			}
			System.out.println("");
		}
		return array;
	}
}