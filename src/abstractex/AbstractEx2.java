package abstractex;

import javax.swing.plaf.synth.SynthOptionPaneUI;

abstract class Shape{ //�ٸ� ��Ű���� �ִ� �̸� �ߺ��ŵ� ��.
	abstract public void OnDraw();
	abstract public void OnDelete();
}
class Rectangle extends Shape{
	@Override
	public void OnDraw() {
		System.out.println("�簢���� �׷���...");
	}
	@Override
	public void OnDelete() {
		System.out.println("�簢���� ������...");
}
}
	class Triangle extends Shape{
		@Override
		public void OnDraw() {
			System.out.println("�ﰢ���� �׷���...");
		}
		@Override
		public void OnDelete() {
			System.out.println("�ﰢ���� ������...");
	}
	}
public class AbstractEx2 {

	public static void main(String[] args) {
		Shape sh=null;
		sh=new Rectangle();
		sh.OnDraw();
		sh.OnDelete();
		
		sh= new Triangle();
		sh.OnDraw();
		sh.OnDelete();
		
		Rectangle rt=new Rectangle();
		rt.OnDraw();
		rt.OnDelete();
		
		Triangle tr=new Triangle();
		tr.OnDraw();
		tr.OnDelete();
	}

}
