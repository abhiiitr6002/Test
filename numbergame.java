import java.io.*;
import java.lang.Math.*;
import java.util.*;

public class numbergame{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<Integer> list = new ArrayList<Integer>();
			int size = Integer.parseInt(read.readLine());
			//int array[] = new int[2*size];
			for (int i=0;i<size;i++) {
				String input = read.readLine();
				String array1[] = input.split(" ");
				int answer = 0;
				int first = Integer.parseInt(array1[0]);
				int second=Integer.parseInt(array1[1]);
				int diff = second - first;
				int first_copy = first;
				int array2[] = new int[diff];
				for (int j=0;j<diff;j++ ) {
					array2[j] = first_copy;
					first_copy--;	
				}
				numbergame obj = new numbergame();
				for (int x:array2 ) {
					answer = answer + obj.factor(x);
				}
				list.add(answer);

			}
			for (int x :list ) {
				System.out.println(x);
			}
		}
		catch(Exception e){

		}
	}
	public int factor(int n){
		int ans=0;
		while(n%2==0){
			n=n/2;
			ans++;
		}
		double p = (double)n;
		for (int k=3;k<=Math.sqrt(p) ;k++ ) {
			 while (n%k == 0)
        {
           // printf("%d ", i);
            n = n/k;
            ans++;
        }
			
		}
		if(n>2){
			ans = 1;
		}
		return ans;

	}
}