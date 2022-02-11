package homework_w3hw1;

public class Starter_w3hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		
		c1.setMname("Dell xps");
		c1.setMyear(2021);
		c1.setMcost(1950);
		
		c2.setMname("Lenovo Yoga");
		c2.setMyear(2020);
		c2.setMcost(1100);
		
		c3.setMname("Macbook Pro");
		c3.setMyear(2022);
		c3.setMcost(2800);
		
		System.out.println("Model: "+c1.getMname());
		System.out.println("Year: "+c1.getMyear());
		System.out.println("Price: $"+c1.getMcost());
		System.out.println();
		
		System.out.println("Model: "+c2.getMname());
		System.out.println("Year: "+c2.getMyear());
		System.out.println("Price: $"+c2.getMcost());
		System.out.println();
		
		System.out.println("Model: "+c3.getMname());
		System.out.println("Year: "+c3.getMyear());
		System.out.println("Price: $"+c3.getMcost());
		System.out.println();
	}

}
