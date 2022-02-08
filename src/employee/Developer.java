package employee;
/*
 * Emp ���
 * -salary:long
 * -bonus: long
 * 
 * +Developer()
 * +Developer(int eno, String phone, String ename)
 * 
 * +toString():String
 * ����: ���ʽ��� ���� 100000�� �������� ����
*/
public class Developer extends Emp{
		 
		private long salary;
		private long bonus;
		
		public Developer() {}

		public Developer(int eno, String phone, String ename) {
			super(eno, phone, ename);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public void setSalary(long salary) {
			this.salary=salary;
		}

		@Override
		public void setBonus(long bonus) {
			this.bonus=bonus+10000;
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
