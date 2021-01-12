package study;

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ŒvŽZŽ®
		int a=8, b=4,c=1;
		System.out.println(calculation(a,b,c));
		
		int x=5;
		System.out.println(multiplication(x)[3]);
		
		
		
		
//		int x=5;
//		int[]multiplication=new int[9];
////		multiplication[0]=1*x;
////		multiplication[1]=2*x;
////		multiplication[2]=3*x;
////		multiplication[3]=4;
////		multiplication[4]=5;
////		multiplication[5]=6;
////		multiplication[6]=7;
////		multiplication[7]=8;
////		multiplication[8]=9;
//		
//		for(int i=0;i<9;i++) {
//			multiplication[i]=x*(i+1);
//			
//		}
//		for(int i=0;i<9;i++) {
//			System.out.println(multiplication[i]);
//		}
			
		
		}
				
		
	
		

		
		
//	ŒvŽZŽ®
	static int calculation(int x,int y,int j){
		
		if ( j==0) {
			return x+y;
		}else if(j==1) {
			return x-y;
		}else if(j==2) {
			return x*y;
		}else {
			return x/y;			
		}
	}

		
		static int []multiplication (int n) {
		
		int[]multiplication=new int[9];
		
		for(int i=0;i<9;i++) {
			multiplication[i]=n*(i+1);
			
		}
//		for(int i=0;i<9;i++) {
//			System.out.println(multiplication[i]);
			return  multiplication;
//		}
			
		}
}
