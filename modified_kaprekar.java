import java.io.*;
import java.util.*;
import java.lang.*;

class modified_kaprekar{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int first = Integer.parseInt(read.readLine());
			int last = Integer.parseInt(read.readLine());
			ArrayList<String> list = new ArrayList<String>();
			StringBuilder builder1 = new StringBuilder();
			for (int i=first;i<=last ;i++ ) {
				//System.out.println(i);
				if (iskarpekar(i,i)) {
					//System.out.println(i);
					list.add(Integer.toString(i));
					builder1.append(i);
					builder1.append(" ");
				}else{
					//Sylist.add("INVALID RANGE");
				}
			}
			if (list.size()==0) {
				System.out.println("INVALID RANGE");
			}else{
						//for (String x :list ) {
				System.out.println(builder1.toString());
			//}
		}
		}catch(Exception e){

		}
	}
	public static boolean iskarpekar(int test,int orign){
		boolean flag = false;
		int copy = test;
		int size = 0;
		while(copy!=0){
			copy/=10;
			size++;
		}

		//System.out.println(size);
		double sqr_tst1 = Math.pow(test,2);
		Long sqr_tst = Math.round(sqr_tst1);
		int size_sqr = 0;
		long sqr_copy = sqr_tst;
		while(sqr_copy!=0){
			sqr_copy/=10;
			size_sqr++;
		}
		if (size_sqr==1){
			if (test==1) {
				return true;
			}else{
				return false;
			}
		}
		if (size_sqr ==(size*2)) {
			//return flag;
			flag = true;
		}else if (size_sqr ==(2*size-1)) {
			flag = true;
		}else{
			return flag;
		}
		Long array[] = new Long[size_sqr];
		if (flag) {
			int k=0;
			//System.out.println(sqr_tst);
			while(sqr_tst!=0){
				array[k] = sqr_tst%10;
				sqr_tst/=10;
				k++;
			}
			if (size_sqr%2==0) {
				int start = 0;
				int last = 0;
				//System.out.println("1");
				StringBuilder builder1 = new StringBuilder();
				StringBuilder builder2 = new StringBuilder();
				for (int i=(size_sqr/2)-1;i>=0;i-- ) {
								builder1.append(array[i]);
								builder2.append(array[i+(size_sqr/2)]);
							}
							start = Integer.parseInt(builder1.toString());
							last = Integer.parseInt(builder2.toString());
							//System.out.println(start);
							//System.out.println(orign);
							if ((start+last)==orign) {
								flag = true;
								//System.out.println("sqr_tst");
							}else{
								flag = false;
							}
			}else{
				int start = 0;
				int last = 0;
				//System.out.println("2");
				StringBuilder builder1 = new StringBuilder();
				StringBuilder builder2 = new StringBuilder();
				for (int i=(size_sqr/2);i>=0 ;i--) {
					builder1.append(array[i]);
				}
				for (int i=size_sqr-1;i>(size_sqr/2) ;i-- ) {
					builder2.append(array[i]);
				}
				start = Integer.parseInt(builder1.toString());
				last = Integer.parseInt(builder2.toString());
				//System.out.println(start);
				//System.out.println(last);
							if ((start+last)==orign) {
								flag = true;
							}else{
								flag = false;
							}
			}
		}
		return flag;
	}
}