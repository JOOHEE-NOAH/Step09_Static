package override;
// �������̵�: �Լ� ������
// ��Ӱ��迡�� ���. �θ�� �����̸��� �Լ��� ��������� ������ �ٸ���.

class Test1{
	public void view1() {System.out.println("view1 method");}
	public void view3() {System.out.println("view3 method");}
}
class Test2 extends Test1 {
	@Override
	public void view1() {System.out.println("view11 method");}
	public void view2()	{System.out.println("view22 method");}
}
public class OverrideEx {

	public static void main(String[] args) {
		Test1 ob=new Test2(); 	//�θ�Ŭ������ ���������� �ڽİ�ü ����
	//	�θ� ��������    �ڽİ�ü����
		ob.view1(); //���� �θ�� ��->�ڽ����� ���� �������̵� �Ǿ��ִ��� Ȯ����->�ڽĿ� �������̵� �������� �ڽĿ��� ���.(�� ����� �������� �� ȿ����)
		ob.view3(); //�θ� -> �ڽĿ� ���� ���� -> �θ��� view3���.
		//view2()�� ��� �Ұ�. �θ� ������ ���� �ʱ� ����
		
//		Test2 ob=new Test2(); //Ŭ������ ������ =new ������();
//		ob.view1(); // �ڽ����� �������� �����ϸ� ���,
//		ob.view2(); // �ڽ����� �������� �����ϸ� ���,
//		ob.view3(); // �ڽ����� ������ ��� �θ����� ���� ���.
		

	}

}
