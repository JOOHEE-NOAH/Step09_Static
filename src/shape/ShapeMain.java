package shape;

public class ShapeMain {

	public static void main(String[] args) {
		Shape sh=null;
		sh= new Rectangle(4, 5);
		System.out.println("�簢���� ���� : "+sh.getSize());
		
		sh=new Triangle(3, 7);
		System.out.println("�ﰢ���� ���� : "+sh.getSize());
	
//		Rectangle rt=new Rectangle(4,5);
//		System.out.println("�簢���� ���� : "+rt.getSize());
//		
//		Triangle tr=new Triangle(3, 7);
//		System.out.println("�ﰢ���� ���� : "+tr.getSize());
	}

}
