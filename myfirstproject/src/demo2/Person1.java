/**
 * 
 */
package demo2;

/**
 * 
 *
 */
public class Person1 {
	
	
	private String address;
	private String town;
	private String state;
	private int zip;
	
	
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getTown() {
		return town;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public void display2()
    {
    	System.out.println("Address : "+this.address);
    	System.out.println("Town : "+this.town);
    	System.out.println("State : "+this.state);
    	System.out.println("Zipcode: "+this.zip);
    	    	
    }
}
	
	
