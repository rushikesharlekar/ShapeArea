package Area;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.setAttribute(3,5);
		System.out.println("Rectangle:"+rectangle.calculateArea());
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.setAttribute(5, 0);
		System.out.println("Circle:"+circle.calculateArea());
		
		Shape triangle = shapeFactory.getShape("TRIANGLE");
		triangle.setAttribute(5, 10);
		System.out.println("Triangle:"+triangle.calculateArea());

	}

}
