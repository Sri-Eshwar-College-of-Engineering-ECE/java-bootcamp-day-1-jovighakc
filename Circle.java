
public class Circle {
	int radius = 7;
	public void calculateArea() {
		float pi = 3.14f;
		float area = pi*radius*radius;
		System.out.println("Radius : "+radius);
		System.out.println("Area : "+area);
	}
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.calculateArea();
	}
}
