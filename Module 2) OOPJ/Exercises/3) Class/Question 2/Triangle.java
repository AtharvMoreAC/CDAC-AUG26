
public class Triangle {
	
	int side1;
	int side2;
	int side3;
	
	public Triangle (int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle obj = new Triangle(3,4,5);
		
		int perimeter = obj.side1 + obj.side2 + obj.side3;
		System.out.println("Perimeter = " + perimeter);
		
		double area = 0.5 * obj.side1 * obj.side2;
		System.out.println("Area = " + area);
		
		

	}

}
