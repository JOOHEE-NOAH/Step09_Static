package animal;
//���� ���ε�: ���� ������ ȣ��� �Լ��� ����
import java.util.Scanner;

public class AnimalMain2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		Animal ani=null; //AnimalMain1ó�� �����ؾ��ϴ� ��ü�� �ʹ� ���� �� 
		//���۰�ü�� ��ǥ�� ����� �ۼ��ϸ� �ۼ��� �� ��������. �ش����� �� ���� ���. 
		
		while(true) {
			System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5Exit\n �����ϼ��� : ");
			n=sc.nextInt();
			
			switch(n) {
			case 1: ani=new Dog();break;//��������ó�� ���  
			case 2: ani=new Cat(); break;
			case 3: ani=new Duck(); break;
			case 4: ani=new Fish();  break;
			default : System.out.println("***** �����մϴ� *****");
			sc.close();
			System.exit(0);
			}
			ani.speak(); //�������� �˷���. ���̴°� �����̶� ������ ����.
			ani.walk(); 
			
		}
	}

}
