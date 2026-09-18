
public class Rectangle {
	
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public void printArea() {
		int area = length * breadth;
		System.out.println("Area of Rectangle = " + area);
	}
	
	public void printParimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle = " + perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
