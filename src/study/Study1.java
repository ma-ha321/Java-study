package study;
import java.util.Random;
import java.util.Scanner;
public class Study1 {
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
 		System.out.println(judge(10));
		
		double height=150.0;
		double weight=60.0;
		double bmi=calculateBmi(height,weight);
		System.out.println("BMI��"+bmi);
		 
		System.out.println(judgeBMI(bmi));
	}

		 
	 static String judge (int age) {
		  
		 if(age<20) {
			 return "�����N";
		}else if(age<30) {
			 return "�Q�O��";
		}else if(age<40) {
			return"�R�O��";
		}else {
			return"�S�O��ȏ�";
		}
		 
	 }
		static double calculateBmi(double height,double weight) {
			double bmi=weight/((height /100.0)*(height/100.0));
			return bmi;
		}
	
		 static String judgeBMI(double bmi) {
			 
			 
			 if(bmi<18.5) {
				  return"��̏d";
			 }else if(bmi<25) {
				 return"����";
			 }else {
				 return"�얞";
			 }
			 
			 
		 }
}

	
