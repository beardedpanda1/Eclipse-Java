package demo2;

public class Teacher extends Person{
    int id;
    double salary;
    String subject;


    public Teacher( String name, int age, char gender, boolean traveling, int id, double salary, String subject, String favfood ){
        super(name, age, gender, traveling, favfood);
        
        this.id =  id;
        this.salary= salary;
        this.subject= subject;
        // TODO Auto-generated constructor stub
        
    }
    
    
    
    public void display() {
        System.out.println("ID " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println();
    }
    
    public void travel() 
    {
        System.out.println("Teacher carpooling");
        System.out.println();
    }



    @Override
	public String toString() {
		return "Teacher [id=" + id + ", salary=" + salary + ", subject=" + subject + ", pname=" + pname + ", page="
				+ page + ", pgender=" + pgender + ", ptravel=" + ptravel + ", ffood=" + ffood + "]";
	}
}
    
