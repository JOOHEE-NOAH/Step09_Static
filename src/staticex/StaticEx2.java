package staticex;
//jvm�������÷���: ������ ������ jvm�� ���� static �ʱ�ȭ���� ���α׷� ����ñ��� �ִٰ� ���α׷� ���� �� jvm�� ����
import java.util.Scanner;

class EC{
	private static double rate; //�޷��� ��ȭ
	
	public static void setRate(double r) {
		rate=r;
	}	
	public static double toDollar(int won) { 
		return won/rate;}
		public static double toWon(int dollar) { 
			return dollar/rate;}
	}

public class StaticEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double rate;
		System.out.println("�޷��� ȯ���� �Է��ϼ��� : ");
		rate=sc.nextDouble();
		
		EC.setRate(rate);
//		System.out.println("1 �޷��� "+EC.toDollar(1000000)+"���Դϴ�");
	}

}
