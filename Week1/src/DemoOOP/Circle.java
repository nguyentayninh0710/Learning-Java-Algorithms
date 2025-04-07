package DemoOOP;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
}

/*
 * Project Description Building a vehicle management system including the
 * following types: Motorcycle, Car and Bus. The system can:
 * 
 * Add new vehicles
 * 
 * Display vehicle information
 * 
 * Calculate inspection fees by type
 */
