import java.io.*;
import java.util.*;

class stick{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			String input = read.readLine();
			String []array = input.split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<Integer> list1= new ArrayList<Integer>();
int array1[] = new int[size];
			for (int i=0;i<size;i++ ) {
				list.add(Integer.parseInt(array[i]));
			}
			Collections.sort(list);
for (int i=0;i<size;i++ ) {
				//list.add(Integer.parseInt(array[i]));
            array1[i]=list.get(i);
			}
            int ans =array1.length;
          //  int ans1 =list.size();
			while(array1[size-1]>0){
				int l=0;
				while(array1[l]<=0){
					l++;
				}
//System.out.println(l);
			//	int m= list.size();
                list1.add(ans);
               // System.out.println(ans);
				int least = array1[l];
//System.out.println(least);
				for (int i=0 ;i<size ;i++) {
//System.out.println(i);
					array1[i]= array1[i]-least;
//System.out.println(array1[i]);
//System.out.println(least);


                    if (array1[i]==0) {
                    	ans--;
                    }
				}
//System.out.println(list.get(5));
				//while(list.get(0)<=0){
				//	list.remove(0);
			    //}
				//int n=list.size();
				
				}
				for (int x :list1) {
					System.out.println(x);

			}
		}catch(Exception e){

		}
	}