
public class PrimeMembers extends Member {
	
	private int joiningYear;
	private double joiningFees;
	private boolean isActive;

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public double getJoiningFees() {
		return joiningFees;
	}

	public void setJoiningFees(double joiningFees) {
		this.joiningFees = joiningFees;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public void display() {
		
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
	    System.out.println("Phone Number : " + getPhoneNumber());
	    System.out.println("Address : " + getAddress());
	    System.out.println("Salary : " + getSalary());

	    System.out.println("Joining Year : " + getJoiningYear());
	    System.out.println("Joining Fees : " + getJoiningFees());
	    System.out.println("Active : " + isActive());
	 	   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrimeMembers obj = new PrimeMembers();

		    System.out.print("Enter Name: ");
		    obj.setName(consoleinput.getstring());

		    System.out.print("Enter Age: ");
		    obj.setAge(consoleinput.getint());
		    
		    System.out.print("Enter Phone Number: ");
		    obj.setPhoneNumber(consoleinput.getstring());

		    System.out.print("Enter Address: ");
		    obj.setAddress(consoleinput.getstring());
		    
		    System.out.print("Enter Salary: ");
		    obj.setSalary(consoleinput.getfloat());
		    
		    System.out.print("Enter Joining Year: ");
		    obj.setJoiningYear(consoleinput.getint());
		    
		    System.out.print("Enter Joining Fees: ");
		    obj.setJoiningFees(consoleinput.getfloat());
		    
		    System.out.print("Is Member Active (true/false): ");
		    obj.setActive(Boolean.parseBoolean(consoleinput.getstring()));
		    
		    obj.display();

	}

}
