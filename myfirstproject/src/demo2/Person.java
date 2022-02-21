package demo2;


public class Person {
   static int  count=0;
	
   String pname;
   int page;
   char pgender;
   boolean ptravel; 
   String ffood;
    
   
   
//    public Person()
//    {
//    	//count++;
//    	this("Peter",34,'M', true);
//    }
    
    //create method to travel
   	//parent class to pass down to child classes
    public Person(String name, int age, char gender, boolean traveling, String favfood)
    {
    	pname=name;
    	page=age;
    	pgender=gender;
    	ptravel=traveling;
    	ffood=favfood;
    	count++;
    }   
    
    public void food()
    {
    	System.out.println("My favorite food is "+this.ffood);
    }
    
    public void travel()
    {
    	//if else statement for traveling if traveling, print im traveling/if not im remote
    	if (ptravel) {
    		System.out.println("Im traveling!");
    	} else {
    		System.out.println("I'm remote!");
    	}
    	
    }
    
    public void Hello()
    {
    	System.out.println("Hello there!!");
    }
    
    
    public void display()
    {
    	System.out.println("Name : "+this.pname);
    	System.out.println("Gender : "+this.pgender);
    	System.out.println("Age : "+this.page);
    	    	
    }
    
    
    
    
//   public void display(Person obj)
//    {
//  	System.out.println("within parameterized display...");
//  	System.out.println("Name : "+obj.pname);
//
//    }
    
   double calculate(int num)
    {
    	System.out.println("calculate inside parent class");
    	return 121.33;
    }
    
    public  static  void totalPerson()
    {
    	System.out.println("total person objects are:"+ count);
    }
    
    


}
