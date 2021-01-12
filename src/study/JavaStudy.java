package study;
import java.util.Random;
import java.util.Scanner;
public class JavaStudy {
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		hello();
		
//		 int i=num();
//		 System.out.println(i);
		 
		 
//		 System.out.println(price(600));
//		 
//		 int a=10,b=30;
//		 System.out.println(ave(a,b));
//		 
		 int totalprice=(totalprice());
		 System.out.println("çáåvã‡äzÇÕ"+totalprice);
		 
		 int price=(price(totalprice));
		 System.out.println("ê≈çûÇ›"+price);
		 
		 number(7);
	System.out.println(hantei(4));
	
	
	

	 }
	
	
	static void hello() {
		System.out.println("Ç±ÇÒÇ…ÇøÇÕ");
	}
//	static int num() {
//		int result=1;
//		for(int i=1;i<=8;i++) {
//			result*=2;			
//		}
//		return result;
//	}
	 static int price(int x) {
		 int tax=10;
		 return x*110/100;
	 }
	 static int ave(int x,int y) {		 
		 return(x+y)/2;	
	 }
	 
	 
	 static String hantei(int num) {
	 if(num%2==0) {	
		 return "ãÙêî";
	 }else {
		 
		 return "äÔêî";
	 }
	 }
	 
//	à¯êîÇÕÇ»ÇµÅAçáåvã‡äzÇñﬂÇËílÇ∆ÇµÇƒÉÅÉCÉìÇ…ï‘Ç∑  	
	 static int totalprice() {
		 Scanner s=new Scanner(System.in);	
			int price=0;	
			
			while(true) {	
				System.out.println("ã‡äzÇì¸óÕÇµÇƒÇ≠ÇæÇ≥Ç¢");		
				int num=s.nextInt();
				price+=num;
				
				System.out.println("ë±ÇØÇ‹Ç∑Ç©ÅH"+"1"+":"+"ÇÕÇ¢"	+"2"+":"+"Ç¢Ç¢Ç¶");
				 num=s.nextInt();
				
				 if(num==2) 
					 break;
				
					System.out.println("çáåvã‡äzÇÕ"+price+"Ç≈Ç∑");
					
					System.out.println("ê≈çûÇ›"+price*110/100+"Ç≈Ç∑");
					
										
				}
				
				return price;
	 }
	 			static void number(int x) {
	 					int result; 			
	 				for(int i=1;i<10;i++) {
	 					System.out.println(x*i);
	 }
//	 			
	 		

	 			}
	 
}
	 

