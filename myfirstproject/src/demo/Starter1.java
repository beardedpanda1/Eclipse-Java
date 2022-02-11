package demo;
//connected to Person1
public class Starter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//POJOS
		Person1 p1 = new Person1();
		Person1 p2 = new Person1();
		
		//assigning or setting the properties
		p1.setPname("John");
		p1.setPage(30);
		p1.setPgender('M');
		
		p2.setPname("Jenny");
		p2.setPage(20);
		p2.setPgender('F');
		
		//Displaying properties
		System.out.println(p1.getPname());
		System.out.println(p1.getPage());
		System.out.println(p1.getPgender());
		
		System.out.println(p2.getPname());
		System.out.println(p2.getPage());
		System.out.println(p2.getPgender());
	}

}
