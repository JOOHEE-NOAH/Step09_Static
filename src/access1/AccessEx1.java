package access1;

import access2.AccessEx3;
//import ��Ű����, Ŭ������;
import access2.AccessEx4;
//����Ʈ ����Ű Ctrl+Shit+o
public class AccessEx1 extends AccessEx4{
	private int x=10;
	private int y=20;
	public static void main(String[] args) {
		AccessEx1 a1=new AccessEx1();//��� ������ ���� ����
		System.out.println(a1.x+"\t"+a1.y);
		
		AccessEx2 a2=new AccessEx2();//���� ��Ű�� ���̶� ���� ����
		System.out.println(a2.x+"\t"+a2.y);
		
		AccessEx3 a3=new AccessEx3();
		System.out.println(a3.x+"\t"+a3.y);

		
		
		
		
//		AccessEx4 a4=new AccessEx4();
//		System.out.print(a4.x+"\t"+a4.y); //��4�� protected�� �ٸ� ��Ű������ ��� �Ұ�.
		//���� ��1���� ��4�� ��üȭ�ϸ� �ȴ� extends AccessEx4
		System.out.println(a1.a+"\t"+a1.b);
	}

}
