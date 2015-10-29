import java.io.*;
import java.util.*;

class flipbits{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Long> list = new ArrayList<Long>();
			for (int i=0;i<size ;i++ ) {

				Long input = Long.parseLong(read.readLine());
				Long arr[] = new Long[32];
                for(int l=0;l<32;l++){
                arr[l]=0L;
                }
				Long bet = input;
				int k=0;
				while(!(input==0L)){
					arr[k]=input%2L;
					input = input/2L;
					k++;
				}

			//	for (int l=0;l<32 ;l++ ) {
			//		System.out.println(arr[l]);
			//	}
				Long ans=0L;
				for (int j=0;j<32 ;j++ ) {
					if (arr[j]==(0L)) {
						arr[j]=1L;

						//double one = arr[j].doubleValue();
						Integer obj =new Integer(j);
						//System.out.println(ans);
						double two = obj.doubleValue();
						double bet1= Math.pow(2.0,two);
						Double obj1 = new Double(bet1);
						ans += obj1.longValue(); 

					}else{
//System.out.println("check");
						arr[j]=0L;
					}
				}
				list.add(ans);
			}
			for (Long x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){
System.out.println("x");

		}
	}
}