package Area;

public class Circle implements Shape {
	
	private float radius;

	public float getRadius() {
		return radius;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	
	public float calculateArea() {
		float area = (float) (2 * 3.14 * this.radius);
		return area;
	}

	
	public void setAttribute(int i, int j) {
		this.radius = i;
	}

}
