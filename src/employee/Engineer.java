package employee;
/*
 * Emp ���
 * -salary:long
 * -bonus: long
 * 
 * +Engineer()
 * +Engineer(int eno, String phone, String ename)
 * 
 * +toString():String
 * 
 * ����: ���ʽ��� ���� 150000�� �������� ����
*/
public class Engineer extends Emp{
 
	private long salary;
	private long bonus;
	
	public Engineer() {}

	public Engineer(int eno, String phone, String ename) {
		super(eno, phone, ename);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setSalary(long salary) {
		this.salary=salary;
	}

	@Override
	public void setBonus(long bonus) {
		this.bonus=bonus+150000;
	}
	public String toString() {
		return "�����ȣ : "+/*super. ����*/getEno()+
				"\n����̸� : "+getEname()
				+"\n������ȣ : "+getPhone()
				+"\n�⺻�޿� : "+salary
				+"\n���ʽ�+���� : "+bonus
				+"\n���ޱݾ� : "+(salary+bonus)+"��\n";
	}
}
