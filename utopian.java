import java.io.*;
import java.util.*;

class utopian{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<size;i++){
				int input = Integer.parseInt(read.readLine());
				if(input%2==0){
					int ans =height(input);
					list.add(ans);
				}else{
					int ans=2*height(input-1);
					//System.out.println(ans);
					list.add(ans);
				}
				
				}
				for (int j=0;j<list.size() ;j++ ) {
					System.out.println(list.get(j));
			}
		}catch(Exception e){

		}
	}
		public static int height(int in){
			int pow =(in/2)+1;
			int ans =(int)Math.pow(2,pow)-1;
			return ans;
		}
}