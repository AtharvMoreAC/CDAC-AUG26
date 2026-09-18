
public class Child extends Parent {
	
	public void displayChild() {
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Parent p = new Parent();
		p.displayParent();
		
		Child c = new Child();
		c.displayChild();
		
		c.displayParent();

	}

}
