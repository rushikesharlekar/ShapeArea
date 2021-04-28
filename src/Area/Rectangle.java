package Area;

public class Rectangle implements Shape{
	
	private float length;
	private float breadth;

	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	
	public float calculateArea() {
		float area = this.breadth * this.length;
		return area;
	}

	
	public void setAttribute(int i, int j) {
		this.breadth = j;
		this.length = i;
		
	}

}
