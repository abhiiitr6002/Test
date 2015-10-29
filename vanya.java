import java.io.*;
import java.util.*;

public class vanya{
	public static void main(String[] args) {
		try{
			BufferedReader read = new  BufferedReader(new InputStreamReader(System.in));
			Long input = Long.parseLong(read.readLine());
			int digits=0;
			Long copy = input;
			while(copy!=0){
				copy=copy/10;
				digits++;
			}
		    Long arr[] = new Long[digits];
			copy = input;
			int i=0;
			Long copy1= input;
			// 2_dig = 189L;
			while(copy!=0){
				arr[i] =copy%10;
				copy = copy/10;
				i++;
			}
			Long ans =0L; 
			if (digits==1) {
				ans =input;
			}else if(digits ==2){
				//copy1  = copy -9L;
				ans = (arr[digits-1]-1)*20 + (arr[digits-2]+1)*2 +9L;
			}else if(digits==3){
				ans = (arr[2]-1)*300 + arr[1]*30 + (arr[0]+1)*3 + 189L ;
			}
			else if (digits==4) {
				ans = (arr[3]-1)*4000 + arr[2]*400 +arr[1]*40+(arr[0]-1)*4+2889L;
			}else if (digits==5) {
				ans = (arr[4]-1)*50000 + arr[3]*5000 + arr[2]*500 + arr[1]*50 +(arr[0]+1)*5 +38889L ;
			}else if (digits==6) {
				ans = (arr[5]-1)*600000 +arr[4]*60000 +arr[3]*6000 +arr[2]*600 +arr[1]*60 +(arr[0]+1)*6+488889L ;
			}else if (digits ==7) {
				ans = (arr[6]-1)*7000000+ arr[5]*700000 +arr[4]*70000 +arr[3]*7000 +arr[2]*700 +arr[1]*70+(arr[0]+1)*7+5888889L;
			}else if (digits == 8 ) {
				ans = (arr[7]-1)*80000000 + arr[6]*8000000 + arr[5]*800000 + arr[4]*80000 +arr[3]*8000 +arr[2]*800 +arr[1]*80 +(arr[0]+1)*8+68888889L;
			}else if (digits==9) {
				ans = (arr[8]-1)*900000000 + arr[7]*90000000 +arr[6]*9000000 +arr[5]*900000 +arr[4]*90000 +arr[3]*9000 +arr[2]*900 +arr[1]*90 +(arr[0]+1)*9+788888889L;
			}
			System.out.println(ans);
		}catch(Exception e){

		}
	}
}