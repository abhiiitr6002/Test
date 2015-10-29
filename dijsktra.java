import java.io.*;
import java.util.*;

class dijsktra{
	public static void main(String[] args) {
		try{
			BufferedReader read = new  BufferedReader(new InputStreamReader(System.in));
			int size =Integer.parseInt(read.readLine());
			ArrayList<String> list1 = new ArrayList<String>();
			for(int i=0;i<size;i++){
				String input = read.readLine();
				String []arr1 = input.split(" ");
				int n = Integer.parseInt(arr1[0]);
				int m = Integer.parseInt(arr1[1]);
				int arr2d[][] = new int[n+1][n+1];
				ArrayList<Integer> arr[] = new ArrayList[n+1];
				for (int j=0;j<=n ;j++ ) {
					arr[j] = new ArrayList<Integer>();
				}
				for(int j=0;j<m;j++){
					String input1 = read.readLine();
					String arr11[] = input1.split(" ");
					int first = Integer.parseInt(arr11[0]);
					int sec = Integer.parseInt(arr11[1]);
					int third = Integer.parseInt(arr11[2]);
					arr2d[first][sec]=third;
					arr2d[sec][first]=third;
					if (!arr[first].contains(sec)) {
						arr[first].add(sec);
					}
					if (!arr[sec].contains(first)) {
						arr[sec].add(first);
					}
				}
				//for (int k=0;k<=n ;k++ ) {
				//	System.out.println(arr[k]);
				//}
				int start = Integer.parseInt(read.readLine());
				int array[] = new int[n+1];
				//array[start]=1;
				ArrayList<Integer> list = new ArrayList<Integer>();
				boolean visited[] = new boolean[n+1];
				for (int k=0;k<=n ;k++ ) {
					visited[k]=true;
				}
				list.add(start);
				//visited[start] =false;
				while(!(list.size()==0)){
					int v = list.get(0);
					list.remove(0);
					while(!(arr[v].size()==0)){
						int x = arr[v].get(0);
						arr[v].remove(0);
						//if (visited[x] ) {
							list.add(x);
							if (array[x]==0) {
								array[x] =array[v]+arr2d[x][v];
							}else{
								if (array[x]>array[v]) {
									array[x] =array[v]+arr2d[x][v];
								}
							//}
						}
					}
					//visited[v] = false;
				}
            //    for (int k=0;k<=n ;k++ ) {
			//		System.out.println(visited[k]);
			//	}            
				StringBuilder build = new StringBuilder();
				for(int k=1; k<=(n);k++){
                int x= array[k];
                if (k==start) {
                	
                }else if(x>0){
						build.append(array[k]);
						build.append(" ");
					}else{
						build.append(-1);
						build.append(" ");
					}
				}
				list1.add(build.toString());
			}
			for (String x:list1 ) {
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}