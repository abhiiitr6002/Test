import java.io.*;
import java.util.*;

class snake{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			snake obj = new snake();
			for (int i=0;i<size ;i++ ) {
				int lad = Integer.parseInt(read.readLine());
				//int arr2d[][] = new int[10][10];
				int array[] = new int[100];
				for (int x=0 ;x<100;x++ ) {
					array[x]=-1;
				}
				for (int j=1;j<=lad ;j++ ) {
					String input = read.readLine();
					String arr[] =input.split(" ");
					int first = Integer.parseInt(arr[0]);
					int second = Integer.parseInt(arr[1]);
					array[first] = second;
					//int mod = first/10;
					//int col = first%10;
					//arr2d[mod][col] = j;
				}
				int sane = Integer.parseInt(read.readLine());
				//int array1[] = new int[sane];
				for (int j=0;j<sane;j++ ) {
					String input = read.readLine();
					String arr[] =input.split(" ");
					int first = Integer.parseInt(arr[0]);
					int second = Integer.parseInt(arr[1]);
					array[first] = second;
					//int mod = first/10;
					//int col = first%10;
					//arr2d[mod][col] = j+15;
				}
				int ans = obj.ladder(array,100);
				list.add(ans);
			}
			for (int x :list ) {
			System.out.println(x);	
			}
		}catch(Exception e){

		}
	}
	public int ladder(int array[],int index){
		int ans=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int ansarr[] = new int[101];
		boolean visited[] = new boolean[101];
		for (int i=0;i<=index ;i++ ) {
			visited[i]=true;
		}
		//visited[0]=false;
		list.add(1);
		ansarr[1]=-1;
		while(!(list.size()==0)){
			//ans++;
			int x = list.get(0);
			list.remove(0);
			if (x==100) {
				break;
			}
			for (int i=(x+1);i<=(x+6) && (i)<=index;i++ ) {
				if(visited[i]){
					list.add(i);
					if(ansarr[i]==0){
						ansarr[i] = ansarr[x]+1;
					}else{
						if (ansarr[i]>ansarr[x]){
							ansarr[i]=ansarr[x]+1;
						}
				}
			}
		}
			visited[x]=false;
		}
		return ansarr[100];
	}
}