package view;

import model.ShapeFactory;
import model.Shape;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		Shape s1 = ShapeFactory.getShape("Square");
		Shape s2 = ShapeFactory.getShape("Circle");
		Shape s3 = ShapeFactory.getShape("Rectangle");

		System.out.println("Drawing of shape s1:");
		s1.draw();
		System.out.println("Drawing of shape s2:");
		s2.draw();
		System.out.println("Drawing of shape s3:");
		s3.draw();
	}
}
