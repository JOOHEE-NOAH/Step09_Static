package staticex;
//�ν��Ͻ� ������ ���õǴ� �۾��� �ϴ� �޼��带 �ν��Ͻ��޼������Ѵ�.(static�� ���� ���� �޼���)
//static������ ���õǴ� �۾��� �ϴ� �޼��带 static�޼���(Ŭ���� �޼���)

class Test{
	int x;
	int y;
	static int z;
	static {
	//z=100;
		System.out.println("static �ʱ�ȭ����");
	} //����Ʈ �����ں��� ���� �����ϰ� ��ü�� ���������. //
	public Test() {
		
	}
	public Test(int x, int y, int z1) {
		this.x=x;
		this.y=y;
	//	this.z=z; // static ������ �̷��� ǥ�� ���ϰ�
	//	Test.z=z; // Ŭ������.�����̸�=�Ű�����;
		z=z1; 
	}
	public void view() {
		System.out.println(x+"\t"+y+"\t"+z);
	}
}
public class StaticEx1 {

	public static void main(String[] args) {
	//	new Test().view();
		Test ob1= new Test(1,2,3);
		
		Test ob2= new Test(4,5,6);
		ob1.view();
		ob2.view(); 
		
		 
	}

}
