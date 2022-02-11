package challengespackage;

public class ObjectsLab {
	
	public class Student
	{
	    // Instance Variables
	    int id;
		String fname;
		String lname;
	    String email;
	    int sub1;
	    int sub2;
	    int sub3;
	   
	    // Constructor Declaration of Class
	    public Student(int id, String fname, String lname, String email,int sub1, int sub2, int sub3)
	    {
	        this.id = id;
	    	this.fname = fname;
	    	this.lname = lname;
	        this.email = email;
	        this.sub1 = sub1;
	        this.sub2 = sub2;
	        this.sub3 = sub3;
	    }
	   
	    // method 1
	    public void display()
	    {
	        System.out.println("Student ID: "+id);
	        System.out.println("First Name: "+fname);
	        System.out.println("Last Name: "+lname);
	        System.out.println("Email: "+email);
	        System.out.println("Subject 1: "+sub1);
	        System.out.println("Subject 2: "+sub2);
	        System.out.println("subject 3: "+sub3);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(0001,"Asim","Alam","someemail@gmail.com",95,80,100);
		Student s2 = new Student(0002,"Kevin","Doe","kevinsemail@gmail.com",97,85,100);
		
		
		s1.display();
		s2.display();
	}

}
