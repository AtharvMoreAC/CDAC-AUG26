
public class Student {
	
	String name;
	int roll_no;
	String phone_no;
	String address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "John";
		student1.roll_no = 2;
		student1.phone_no = "8889993334";
		student1.address = "Pune";
		
		student2.name = "Sam";
		student2.roll_no = 1;
		student2.phone_no = "8889993335";
		student2.address = "Mumbai";
		
		System.out.println("Student Name :" + student1.name);
		System.out.println("Student Roll No : " + student1.roll_no);
		System.out.println("Student Phone No : " + student1.phone_no);
		System.out.println("Student Address : " + student1.address);
		
		System.out.println();
		
		System.out.println("Student Name : " + student2.name);
		System.out.println("Student Roll No : " + student2.roll_no);
		System.out.println("Student Phone No : " + student2.phone_no);
		System.out.println("Student Address : " + student2.address);
			
	}

}
