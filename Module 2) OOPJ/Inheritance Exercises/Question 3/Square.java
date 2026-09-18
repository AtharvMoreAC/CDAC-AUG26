
public class Square extends Rectangle {
	
	public Square(int side) {
		super(side, side);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(10, 5);
		r.printArea();
		r.printParimeter();
		
		Square s = new Square(5);
		s.printArea();
		s.printParimeter();

	}

}
