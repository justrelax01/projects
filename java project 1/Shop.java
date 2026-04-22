package project;
import java.util.ArrayList;

public class Shop{

    private Static String name='H & G';
    private Static String dateOfOpening='All week days execpt sundays';
    private Static String address= 'Beirut';
    private ArrayList<String> owners=new ArrayList<String>();
    private ArrayList<Employee> Employeelist =new ArrayList<Employee>();
    private ArrayList<Order> Orderlist =new ArrayList<Order>();
    private ArrayList<Custumer> Custumerlist =new ArrayList<Custumer>();
    private Static int phonenumbers='';

    public Shop(String name,int phonenumbers,String dateOfOpening,String address,ArrayList<Employee> Employeelist,ArrayList<Order> Orderlist,ArrayList<Custumer> Custumerlist,ArrayList<String> owners){
        this.name=name;
        this.dateOfOpening=dateOfOpening;
        this.address=address;
        this.phonenumbers=phoneNumbers;
        this.owners=owners;
        this.Employeelist=Employeelist;
        this.Custumerlist=Custumerlist;
        this.Orderlist=Orderlist;
    }

    public String getName(){
        return this.name;
    }

    public void SetName(String name){
        this.name=name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getPhoneNumbers(){
        return phoneNumbers;
    }

    public void setPhoneNumbers(){
        this.phonenumbers=phoneNumbers;
    }

    public String getDateOfOpening(){
        return dateOfOpening;
    }

    public void setDateOfOpening(String dateOfOpening){
        this.dateOfOpening=dateOfOpening
    }

    public ArrayList<String> getOwners() {
		return owners;
	}

	public void setOwners(ArrayList<String> owners) {
		this.owners = owners;
	}

    public ArrayList<Employee> getEmployeelist() {
		return Employeelist;
	}

	public void setEmployeelist(ArrayList<Employee> Employeelist) {
		this.Employeelist=Employeelist;
	}

    public ArrayList<Order> getOrderlist() {
		return Orderlist;
	}

	public void setOrderlist(ArrayList<Order> Orderlist) {
		this.Orderlist=Orderlist;
	}

    public ArrayList<Custumer> getCustumerlist() {
		return Custumerlist;
	}

	public void setCustumer(ArrayList<Custumer> Custumerlist) {
		this.Custumerlist=Custumerlist;
	}

    public String toString(){
        return "Shop name:"+this.name+"\nAddress:"+this.address+"\nDate of openning:"+this.dateOfOpening+"\nphone numbers:"+this.phonenumbers;
    }

}