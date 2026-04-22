package project;

public class Custumer {

	private String firstname;
	private String lastname;
	private String Email;
	private String location;
	private Order order;
	public Custumer(String fname,String lname,String email,String location, Order order) {
		
		if(fname.length()<2 || fname.length()>12)
			this.firstname="Empty";
		else
			this.firstname=fname;
		
		if (lname.length()<3 || lname.length()>12) 
			this.lastname="Empty";
		else
			this.lastname=lname;
		
		if (location.equalsIgnoreCase("Beirut") || location.equalsIgnoreCase("Baabda") || location.equalsIgnoreCase("Zahle"))
			this.location=location;
		else
			this.location="Empty";
	
	   this.Email=email;
	   this.order=order;
		
	}
	
	public String getFirstName() {
		return this.firstname;
	}
	
	public void setFirstName(String firstname) {
		if(firstname.length()<2 || firstname.length()>12)
			this.firstname="Empty";
		else
			this.firstname=firstname;
		
	}
	public String getLastName() {
		return this.lastname;
		
	}
	
	public void setLastName(String lname) {
		if (lname.length()<3 || lname.length()>12) 
			this.lastname="Empty";
		else
			this.lastname=lname;
		
	}
	
	public String getEmail() {
		return this.Email;
	}
	
	public void setEmail(String Email) {
		this.Email=Email;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location)
	{
		if (location.equals("Beirut") || location.equals("Baabda") || location.equals("Zahle"))
			this.location=location;
		else
			this.location="Empty";
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String toString() {
		return "Custumer's:\n"+"Firstname:"+this.firstname+"\nlastname:"+this.lastname+"\nEmail:"+this.Email+"\nlocation:"+this.location+"\nOrder Info"+this.order;
	}
	
}