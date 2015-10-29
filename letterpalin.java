import java.io.*;
import java.util.ArrayList;

class letterpalin{
	public static void main(String[] args) {
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(read.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<size;i++) {
				String word =read.readLine();
				char array[] = word.toCharArray();
				int ws =array.length;
				//System.out.println(ws);
				int count=0;
				if(array.length%2==0){
					//System.out.println("asdffh");
					for(int j=0;j<ws/2;j++){
						//System.out.println("asdffh");
						int ascii1=(int)array[j];
						//System.out.println(ascii1);
							int ascii2=(int)array[(ws)-j-1];
						while(ascii1!=ascii2){
							//System.out.println("hi");
								
							if(ascii1==97||ascii2>ascii1){
								ascii2=ascii2-1;
								//System.out.println("hi");
							}else if(ascii2==97||ascii1>ascii2){
								ascii1=ascii1-1;
							}
							//array[j]=(char)ascii1;
							//array[(ws/2)-j-1]=(char)ascii2;
							//System.out.println(array[(ws)-j-1]);
							//System.out.println(array[j]);
							count++;
						}
						//array[j]=(char)ascii1;
					    //array[(ws/2)-j-1]=(char)ascii2;
					}
				}else{
					for(int j=0;j<(ws+1)/2;j++){
						int ascii1 =(int)array[j];
						int ascii2 =(int)array[ws-j-1];
						while(ascii1!=ascii2){
							if(ascii1==97||ascii2>ascii1){
								ascii2=ascii2-1;
								//System.out.println("hi");
							}else if(ascii2==97||ascii1>ascii2){
								ascii1=ascii1-1;
							}
							count++;
						}
					}
				}
					list.add(count);
			}
			for(int x:list){
				System.out.println(x);
			}
		}catch(Exception e){

		}
	}
}