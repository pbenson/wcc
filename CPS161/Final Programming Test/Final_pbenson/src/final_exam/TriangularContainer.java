package final_exam;

public class TriangularContainer extends Container {
	private double side_a;
	private double side_b;
	private double side_c;

	// add appropriate data definitions
	TriangularContainer(double height, double side_a, double side_b, double side_c) {
		// Fill in details
		super(height);
		this.side_a = side_a;
		this.side_b = side_b;
		this.side_c = side_c;
	}
	// implement required abstract methods

	@Override
	double getTopArea() {
		// TODO Auto-generated method stub
		double s = (side_a + side_b + side_c) / 2.0;
		return Math.sqrt(s * (s - side_a) * (s - side_b) * (s - side_c));
	}

	@Override
	double getTopPerimeter() {
		// TODO Auto-generated method stub
		return side_a + side_b + side_c;
	}

}
