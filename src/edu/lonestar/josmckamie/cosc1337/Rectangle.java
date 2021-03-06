package edu.lonestar.josmckamie.cosc1337;

public class Rectangle {

	/** rectangle width */
	private double width;
	/** rectangle length */
	private double length;

	/**
	 * constructor
	 * 
	 * @param width
	 *            rectangle width
	 * @param length
	 *            rectangle length
	 */
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getArea() {
		return (width * length);

	}

	@Override
	public String toString() {
		return String.format("Rectangle width = %f\nRectangle length = %f\nRectangle area = %f", width, length,
				getArea());

	}
}
