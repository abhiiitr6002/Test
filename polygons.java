import java.io.*;
import java.util.*;

class polygons{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size= Integer.parseInt(read.readLine());
			ArrayList<String> list = new ArrayList<String>();
			for (int i=0;i<size ;i++ ) {
				int input = Integer.parseInt(read.readLine());
				int [] array= new int[input];
				double arraytwo[] = new double[input];
				int cache[] = new int[input];
				double area =0.0 ;
				for (int j=0;j<input;j++ ) {
					int vertices = Integer.parseInt(read.readLine());
					String cordinate = read.readLine();
					String array1[] = cordinate.split(" ");
					int []x_cor =new int[vertices];
					int []y_cor =new int[vertices];
					int arrayone[] = new int[size];
				//	System.out.println("hey");
					for (int k=0;k<array1.length ;k++ ) {
						//arrayone[k]= Integer.parseInt(array1[k]);
						if (k%2==0) {
							//	System.out.println(k/2);
							x_cor[k/2] = Integer.parseInt(array1[k]);
						}else if(k%2==1){
							y_cor[(k/2)] = Integer.parseInt(array1[k]);
							//System.out.println((k/2));
						}
					}
						//System.out.println("hey");
				    double area1 = poly_area(x_cor,y_cor,vertices);
				    area = Math.abs(area1);
				   // System.out.println(area);
				    arraytwo[j] = area;
				    for (int m=0;m<j ;m++ ) {
				    	if (area>arraytwo[m]) {
				    		cache[j]++;
				    	}else{
				    		cache[m]++;
				    	}
				    }
				   
				}
				 StringBuilder builder = new StringBuilder();
				    for (int l=0;l<input ;l++ ) {
				    	builder.append(cache[l]);
				    	builder.append(" ");
				    }
				    list.add(builder.toString());
				
			}
			for (String x :list ) {
					System.out.println(x);
				}
		}catch(Exception e){

		}
	}
	public static double poly_area(int array[],int array1[],int points){
		double area =0.0;
	//	System.out.println(Arrays.toString(array));
		int j=points-1;
		for (int i=0;i<points;i++ ) {
			area +=(array[i]+array[j])*(array1[j]-array1[i]);
			j=i;
		}
		return area/2;
	}
}