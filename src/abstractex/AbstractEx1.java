package abstractex;
class A{ //�Ϲ� Ŭ����
	public void view1() {System.out.println("view1 method");}
	public void view2() {System.out.println("view2 method");}
}
class B extends A{
	@Override
	public void view1() {System.out.println("view11 method");}
}
public class AbstractEx1 {

	public static void main(String[] args) {
		A ob1=new A(); // ��ü���� ����
		ob1.view1(); //v1
		ob1.view2(); //v2
		
		B ob2=new B();
		ob2.view1(); //v11
		ob2.view2(); //v2
		
		A ob3=new B();
		ob3.view1(); //v11
		ob3.view2(); //v2
	}

}
