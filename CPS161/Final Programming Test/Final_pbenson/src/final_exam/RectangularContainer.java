package final_exam;

public class RectangularContainer extends Container {
	private double width;
	private double length;

	// add appropriate data definitions
	RectangularContainer(double height, double width, double length) {
		// Fill in details
		super(height);
		this.width = width;
		this.length = length;
	}

	@Override
	double getTopArea() {
		// TODO Auto-generated method stub
		return width * length;
	}

	@Override
	double getTopPerimeter() {
		// TODO Auto-generated method stub
		return 2.0 * (width + length);
	}

}
