public class Patient {

    private String id;
    private String name;
    private int age;
    private int yearofbirth;
    private String phonenb;
    private String Address;
    private String medicalrecords;
    private String sex;
    private String bloodtype;

    public Patient(String id, String name, int age, int yearofbirth, String Address, String medicalrecords, String phonenb, String sex, String bloodtype) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Address = Address;
        this.phonenb = phonenb;
        this.medicalrecords = medicalrecords;
        this.sex = sex;
        this.bloodtype = bloodtype;
    }

//    public Patient(String id, String name, int age, int yearofbirth, String phonenb, String Address, String sex, String medicalrecords, String bloodtype) {
//        setId(id);
//        setName(name);
//        setAge(age);
//        setAddress(Address);
//        setMedicalrecords(medicalrecords);
//        setPhonenb(phonenb);
//        setYearofbirth(yearofbirth);
//        setBloodtype(bloodtype);
//    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhonenb() {
        return phonenb;
    }

    public void setPhonenb(String phonenb) {
        if (!phonenb.matches("\\d{10}")) {  // Check for exactly 10 digits
            System.out.println("Phone number should be exactly 10 digits.");
        } else {
            this.phonenb = phonenb;
        }
    }

    public String getMedicalrecords() {
        return medicalrecords;
    }

    public void setMedicalrecords(String medicalrecords) {
        this.medicalrecords = medicalrecords;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public int getYearbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearofbirth=yearofbirth;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year of birth='" + yearofbirth + '\'' +
                ", age=" + age +
                ", phone number=" + phonenb +
                ", sex=" + sex +
                ", Medical records=" + medicalrecords +
                '}';
    }
}
