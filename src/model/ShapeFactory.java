package model;

public class ShapeFactory {

	private ShapeFactory() {
	}

	public static Shape getShape(String shapeType) {
		return switch (shapeType) {
			case "Circle" -> new Circle();
			case "Rectangle" -> new Rectangle();
			case "Square" -> new Square();
			default -> null;
		};
	}
}
