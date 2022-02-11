package demo;
//connected to Starter1
public class Person1 {
	static int count = 0;
	private String pname;
	private int page;
	private char pgender;
	
	public Person1(){
		count++;
	}
	
	public String getPname(){
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getPage(){
		return page;
	}
	
	public void setPage(int page){
		this.page = page;
	}
	
	public char getPgender(){
		return pgender;
	}
	
	public void setPgender(char pgender){
		this.pgender = pgender;
	}

	public static void totalPerson() {
		// TODO Auto-generated method stub
		System.out.println("Total person oblects are: "+count);
	}

}
