package Area;

public class Triangle implements Shape{
	
	private float base;
	private float height;

	public float getBase() {
		return base;
	}

	public float getHeight() {
		return height;
	}

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateArea() {
		float area = (float) (0.5 * this.base * this.height);
		return area;
	}

	@Override
	public void setAttribute(int i, int j) {
		this.base = i;
		this.height = j;
	}

}
