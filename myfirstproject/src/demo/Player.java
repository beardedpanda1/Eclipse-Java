package demo;

public class Player {

	String name;
	String sport;
	int keynum;
	String rank;
	boolean active;
	char gender;
	//for players 1,2,3
	public Player(){}
	//for player 4
	public Player(String n, String s, int kn, String r, boolean a, char g) 
	{
		this.name=n;
		this.sport=s;
		this.keynum=kn;
		this.rank=r;
		this.active=a;
		this.gender=g;
	}
	//for players 1,2,3
	public void display(Player p)
	{
		System.out.println("player name: "+p.name);
		System.out.println("player gender: "+p.gender);
		System.out.println("player sport: "+p.sport);
		System.out.println("player number: "+p.keynum);
		System.out.println("player rank: "+p.rank);
		System.out.println("player status: "+p.active);
		System.out.println();
		
	}
	//for player 4
	public void display() 
	{
		System.out.println("player name: "+name);
		System.out.println("player gender: "+gender);
		System.out.println("player sport: "+sport);
		System.out.println("player number: "+keynum);
		System.out.println("player rank: "+rank);
		System.out.println("player status: "+active);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		//second display method
		Player p4 = new Player("Muffin man", "Baseball", 99, "first base", true, 'M');
		
		p1.name = "Jack";
		p1.sport = "Football";
		p1.keynum = 99;
		p1.rank = "Ex team leader";
		p1.active = false;
		p1.gender = 'M';
		
		p2.name = "Sophie";
		p2.sport = "Soccer";
		p2.keynum = 19;
		p2.rank = "Attacker";
		p2.active = true;
		p2.gender = 'F';
		
		p3.name = "Kevin";
		p3.sport = "Baseball";
		p3.keynum = 35;
		p3.rank = "Outfielder";
		p3.active = true;
		p3.gender = 'M';
		
		p1.display(p1);
		p2.display(p2);
		p3.display(p3);
		p4.display(p4);
	}

}
