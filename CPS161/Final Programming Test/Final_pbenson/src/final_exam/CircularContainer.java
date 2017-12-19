package final_exam;

public class CircularContainer extends Container {
    // add appropriate data definitions
	private double radius;
 CircularContainer(double height, double radius)
 {
	 super(height);
	 this.radius = radius;
     // Fill in details
 }
 // implement required abstract methods

	@Override
	double getTopArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius; 
	}

	@Override
	double getTopPerimeter() {
		// TODO Auto-generated method stub
		return 2.0 * Math.PI * radius; 
	}

}
