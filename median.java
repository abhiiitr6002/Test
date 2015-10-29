import java.io.*;


class median{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			int []array = new int[size];
			String input = read.readLine();
			char []char_array = input.split(" ");
			for (int i=0;i<size;i++) {
				array[i] = Character.getNumericValue(char_array[i]);
			}
			for (int i=(size-2);i>=0;i--) {
				for(int j=0;j<=i;j++){
					if (array[j]>array[j+1]) {
						int swap = array[j];
						array[j] = array[j+1];
						array[j+1] = swap;
					}
				}
			}
			if (size%2==0) {
				System.out.println(array[(size/2)-1]);
			}else{
				System.out.println(array[(size-1)/2]);
			}

		}catch(Exception e){

		}
	}
}