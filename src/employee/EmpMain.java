package employee;

import shape.Rectangle;
import shape.Shape;
import shape.Triangle;

/*�����ȣ : 101
 *����̸� : �Ƿη�
 *������ȣ : 1234
 *�⺻�޿� : 250000
 *���ʽ�+���� : 450000
 *���ޱݾ� : 295000��
 *
 *�����ȣ : 201
 *����̸� : ũ��
 *������ȣ : 5678
 *�⺻�޿� : 150000
 *���ʽ�+���� : 225000
 *���ޱݾ� : 1725000��
 * ����: ���ʽ��� ���� 150000�� �������� ����
 
 * */
public class EmpMain {

	public static void main(String[] args) {
		Emp em=null;
		em=new Engineer(201,"ũ��","5678");
		em.setSalary(1500000);
		em.setBonus(75000);
		System.out.println(em.toString());
		
		
		em=new Developer(101,"�Ƿη�","1234");
		em.setSalary(2500000);
		em.setBonus(35000);
		System.out.println(em.toString());
		
		Engineer eng=new Engineer(201,"ũ��","5678");
		eng.setSalary(1500000);
		eng.setBonus(75000);
		System.out.println(eng.toString());
		
		
		Developer dev=new Developer(101,"�Ƿη�","1234");
		dev.setSalary(2500000);
		dev.setBonus(35000);
		System.out.println(dev.toString());
	}

}
