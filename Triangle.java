package homework;

public class Triangle extends Shape {
	//필드
	private double side;
	//생성자
	public Triangle(double side) {
		this.side = side;
	}
	//메소드
	@Override
	public double area() {
		return side * side * (Math.sqrt(3)/4);
	}
	
	@Override
	public double perimeter() {
		return 3 * side;
	}
	
	public String toString() {
		return String.format("도형의 종류 : 삼각형, 둘레 : " + perimeter() + "cm" + ", 넓이 : " + area()+ "cm²");
	}
	
	
}
