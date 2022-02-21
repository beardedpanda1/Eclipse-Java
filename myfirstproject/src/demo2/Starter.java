package demo2;
import java.util.Scanner;

import demo.Person1;
public class Starter {
    
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        Employee emp1 = new Employee(101, "Tom Smith", 35, 'M', 10456.58, true, "pastrami sandwich");
        Employee emp2 = new Employee(102, "Sheena Anderson", 35, 'F', 12455.65, false, "chicken over rice");
        Student st1 = new Student(1, "Ray", 45, 'M', 95.00, 88.00, 100.00, false, "Sushi");
        Teacher teacher1 = new Teacher("Mike", 45, 'M', true, 43, 3000.00, "History", "Pizza");
        
        System.out.println("enter ID: ");
        int id = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("Enter Name: ");
        String name = scan.nextLine();
        
        System.out.println("Enter Age: ");
        int age = scan.nextInt();
        
        System.out.println("Enter Gender(M/F): ");
        char gender = scan.next().charAt(0);
        
        System.out.println("Enter Salary: ");
        double salary = scan.nextDouble();
        
        System.out.println("Do you travel? Enter True or False: ");
        boolean traveling = scan.nextBoolean();
        
        scan.nextLine();
        System.out.println("What is your favorite food? ");
        String favfood = scan.nextLine();
        
        System.out.println("Enter Address(only street number): ");
        String address = scan.nextLine();
        
        System.out.println("Enter Town: ");
        String town = scan.nextLine();
        
        System.out.println("Enter State: ");
        String state = scan.nextLine();
        
        System.out.println("Enter Zipcode: ");
        int zip = scan.nextInt();
        
        Employee emp3 = new Employee(id, name, age, gender, salary, traveling, favfood);
        System.out.println(emp3);
        
        Person1 person1 = new Person1(address, town, state, zip);
        person1.display2();
        
        emp1.display();
        emp2.display();
        emp3.display();
        st1.display();
        st1.travel();
        teacher1.display();
        teacher1.travel();
        System.out.println(teacher1.toString());
        

//            System.out.println("Net Salary for employees" + emp1.calculate(1000));
//            System.out.println();
//            System.out.println();
//            System.out.println();
//        
//        
//            emp2.display();
//            System.out.println("Net Salary for employees" + emp2.calculate(1200));
//            System.out.println();
//            System.out.println();
//            System.out.println();
//        
            
            Student stud1 = new Student(101, "Mike Miller", 25, 'M', 23.43,34.5,343.0,false, "Sushi");
            
            double avg= stud1.calculate(3);
            
           
            
            
    		
    		
            
//            System.out.println("Average score" + String.format);
            
    }
}
