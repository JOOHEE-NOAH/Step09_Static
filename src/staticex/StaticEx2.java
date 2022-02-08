package staticex;

import java.util.Scanner;

class EC{
	private static double rate; //달러당 원화
	
	public static void setRate(double r) {
		rate=r;
	}	
//	public static double toDollar(int won) { 
//		return won/rate;
//	}
	}

public class StaticEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double rate;
		System.out.println("달러당 환율을 입력하세요 : ");
		rate=sc.nextDouble();
		
		EC.setRate(rate);
//		System.out.println("1 달러는 "+EC.toDollar(1000000)+"원입니다");
	}

}
