import java.util.*;

public class Doctor {

    private String id;
    private String name;
    private String specialization;
    private int yearofbirth;
    private List<String> availableTimes;
    private String sex;
    private String bloodtype;

    public Doctor(String id, String name,int yearofbirth,String bloodtype, String specialization,String sex) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.yearofbirth=yearofbirth;
        this.sex=sex;
        this.bloodtype=bloodtype;
        this.availableTimes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getYearbirth(){
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth){
        this.yearofbirth=yearofbirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex=sex;
    }

    public String getBloodtype(){
        return bloodtype;
    }

    public void setBloodtype(String bloodtype){
        this.bloodtype=bloodtype;
    }

    public List<String> getAvailableTimes() {
        return availableTimes;
    }

    public void addAvailableTime(String time) {
        availableTimes.add(time);
    }

    public void updateAvailableTime(int index, String newTime) {
        if (index >= 0 && index < availableTimes.size()) {
            availableTimes.set(index, newTime);
        }
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", \nname='" + name + '\'' +
                ", \nspecialization='" + specialization + '\'' +
                ", \nYear of birth='"+yearofbirth+'\''+ ", \nsex='"+ sex +'\''+ ", \nblood type='"+ bloodtype+'\''+
                ", \navailableTimes=" + availableTimes +
                '}';
    }



}
