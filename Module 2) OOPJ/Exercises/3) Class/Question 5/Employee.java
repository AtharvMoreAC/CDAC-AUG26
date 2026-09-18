
public class Employee {
	
	String name;
	int yearOfJoining;
	int salary;
	String address;
	
	public Employee(String name, int yearOfJoining, int salary, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Robert", 1994, 0, "64C- WallsStreat");
		Employee e2 = new Employee("Sam", 2000, 0, "68D- WallsStreat");
	    Employee e3 = new Employee("John", 1999, 0, "26B- WallsStreat");

	        System.out.println("Name\tYear of joining\tSalary\tAddress");

	        System.out.println(e1.name + "\t" + e1.yearOfJoining + "\t\t" 
	                + e1.salary + "\t" + e1.address);
	        System.out.println(e2.name + "\t" + e2.yearOfJoining + "\t\t" 
	                + e2.salary + "\t" + e2.address);
	        System.out.println(e3.name + "\t" + e3.yearOfJoining + "\t\t" 
	                + e3.salary + "\t" + e3.address);

	}

}
