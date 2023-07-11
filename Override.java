package Progrmas;
class Shape{
	void draw() {
		System.out.println("drawing....");
	}
}
	class Rectangle extends Shape{
		void draw() {
			System.out.println("draw rectangle...");
		}
	}
	class Triangle extends Shape{
		void draw() {
			System.out.println("draw triangle...");
		}
	}
	class Circle extends Shape{
		void draw() {
			System.out.println("draw circle....");
		}
	}

public class Override {
	public static void main(String[] args) {
		Shape s =new Shape();
		s.draw();
		s=new Rectangle();
		s.draw();
		s=new Triangle();
		s.draw();
		s=new Circle();
		s.draw();
	}

}
