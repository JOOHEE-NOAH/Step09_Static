package shape;
//������, getter setter
public class Shape {
	private int x;
	private int y;
	public Shape() {		
	}
	public Shape(int x, int y) {
		super();
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getSize() {// SapeMain���� Shape sh=null;����ҰŸ� �̰� �߰��ؾ���.
		return 0;
	}
}
