package finalex;
//�ڹٿ��� ���������� �͵�
//class Test{
//String name="�Ƿη�";
//	
//	public void view() {
//		System.out.println("�̸� : "+name);
//	}
//}
//		public class ObjectEx {
//	
//	
//	public static void main(String[] args) {
//		new Test().view();
//
//	}
//
//		}
import java.lang.Object;
import java.lang.String;
import java.lang.System;


class Test{
	String name="�Ƿη�";
	public Test() {
		super();
	}
	public void view() {
		System.out.println("�̸� : "+this.name.toString()); //this ����, toString ����
	}
}
public class ObjectEx {	

	public static void main(String[] args) {
		new Test().view();
		Test ob=new Test();
		ob.view();
	}

		}