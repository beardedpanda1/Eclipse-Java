package homework_w3hw1;

public class Computer {
	static int count = 0;
	private String mname;
	private long myear;
	private long mcost;
	
	public Computer() {
		count++;
	}
	
	public String getMname() {
		return mname;
	}
	
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public long getMyear() {
		return myear;
	}
	
	public void setMyear(long myear) {
		this.myear = myear;
	}
	
	public long getMcost() {
		return mcost;
	}
	
	public void setMcost(long mcost) {
		this.mcost = mcost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Total computer oblects are: "+count);
	}

}
