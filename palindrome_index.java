import java.io.*;
import java.util.*;

class palindrome_index{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size ;i++ ) {
				String input = read.readLine();
				char array[] = input.toCharArray();
				int ans=0;
				boolean flag= true;
				int k=0;
					int l=(array.length)-1;
					if (array.length==1) {
						list.add(-1);
							flag = false;
					}
					if (array.length==2) {
						if (array[0]==array[1]) {
							list.add(-1);
							flag = false;
						}
					}
				while(flag){
				
					if (k>((array.length)/2) ){
						flag = false;
						ans = -1;
						list.add(-1);
						//System.out.println("fg");
					}
					//System.out.println(k);
					if (array[k]==array[l]) {
						l--;
						k++;
						//System.out.println("fg");
						//System.out.println(k);
					}else{
						if (array[k+1]==array[l]) {
							if (array[k]==array[l-1]) {
								if (array[k+2]==array[l-3]&&(array[k+1]==array[l-2])) {
									ans = l;
								}
							}else{
								ans = k;
							}
							list.add(ans);
							flag =false;
						}else if (array[k]==array[l-1]) {
							if (array[k]==array[l-1]) {
								if (array[k+3]==array[l-2]&&(array[k+2]==array[l-1])) {
									ans = k;
								}
							}else{
								ans = l;
							}
							//ans = l;
							list.add(ans);
							flag =false;
						}else{
							ans= -1;
							list.add(ans);
							flag = false;
						//	System.out.println("f122");
						//	System.out.println(array[k+1]);
						//	System.out.println(array[l]);
						}
					}
				}
			}
			for (int x :list ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}