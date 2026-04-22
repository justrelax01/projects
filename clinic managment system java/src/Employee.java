
public class Employee {

    private String name;
    private String id;
    private String Address;
    private int age;
    private int yearofbirth;
    private String bloodtype;
    private String sex;

    public Employee(String id,String name,int age,int yearofbirth,String Address ,String bloodtype,String sex){
        this.name=name;
        this.id=id;
        this.age=age;
        this.yearofbirth=yearofbirth;
        this.bloodtype=bloodtype;
        this.sex=sex;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getAddress(){
        return Address;
    }

    public void setAddress(String Address){
        this.Address=Address;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getYearofbirth(){
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth){
        this.yearofbirth=yearofbirth;
    }

    public String getBloodtype(){
        return bloodtype;
    }

    public void setBloodtype(String bloodtype){
        this.bloodtype=bloodtype;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex=sex;
    }

    public String toString(){
        return "Employee{"+"\nid: "+id+"\n name: "+name+"\nage:  "+age+"\nyear of birth: "+yearofbirth+"\n Address: "+Address+"\nsex: "+sex
                +"\n bloodtype :"+bloodtype;
    }


}
