import java.io.*;


class angry{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int packet_number =Integer.parseInt(read.readLine());
			int children_number = Integer.parseInt(read.readLine());
			int array[] = new int[packet_number];
			for (int i=0;i<packet_number;i++) {
				array[i] = Integer.parseInt(read.readLine());
			}
			for (int j=(packet_number-1);j>=0;j--) {
				for (int k=0;k<j ;k++ ) {
					if(array[k]>array[k+1]){
						int swap=array[k];
						array[k]=array[k+1];
						array[k+1]=swap;
					}
				}
			}
			int min=array[packet_number-1];
			for (int k=0;k< array.length;k++ ) {
			System.out.println(array[k]);	
			}
			int array_dif[] = new int[packet_number- children_number];
			for (int i=0;i<(packet_number- children_number);i++ ) {
				array_dif[i]=(array[i+children_number-1]-array[i]);
				if (min>array_dif[i]) {
					min=array_dif[i];
				}
			}
			System.out.println(min);
		}catch(Exception e){

		}
	}
}