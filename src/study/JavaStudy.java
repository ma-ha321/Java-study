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
		 System.out.println("合計金額は"+totalprice);
		 
		 int price=(price(totalprice));
		 System.out.println("税込み"+price);
		 
		 number(7);
	System.out.println(hantei(4));
	
	
	

	 }
	
	
	static void hello() {
		System.out.println("こんにちは");
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
		 return "偶数";
	 }else {
		 
		 return "奇数";
	 }
	 }
	 
//	引数はなし、合計金額を戻り値としてメインに返す  	
	 static int totalprice() {
		 Scanner s=new Scanner(System.in);	
			int price=0;	
			
			while(true) {	
				System.out.println("金額を入力してください");		
				int num=s.nextInt();
				price+=num;
				
				System.out.println("続けますか？"+"1"+":"+"はい"	+"2"+":"+"いいえ");
				 num=s.nextInt();
				
				 if(num==2) 
					 break;
				
					System.out.println("合計金額は"+price+"です");
					
					System.out.println("税込み"+price*110/100+"です");
					
										
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
	 

