package finalex;
//��� : �̸��� ������ ������, �Ű������� �ְ� ������ ���.

class Final{
	final int n=100;// ������ ���ȭ, final ���� n
	public void view(final int a) { //���ο��� ���̳� ������ �ȵǴ� �� �ƴ����� ���������� �θ� ����
		
//		n=200; //final ������ ���� ������ �Ұ���
//		a=300; //�������� a�� final �����̱� ������ ���� �Ұ�
		System.out.println(a);
	}
}
class FinalEx extends Final{
//	@Override
//	public void view(final int a) {// final �޼���� �������̵� �Ұ�
//		
//	}
}

public class FinalTest {

	public static void main(String[] args) {
		Final ob=new Final();
		
		ob.view(200);
	}

}
