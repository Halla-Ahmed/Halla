public class student extends person{
    final String status1 = "Freshman";
    final String status2 = "Sophomore";
    final String status3 = "Junior";
    final String status4 = "Senior";
    public student(String name,String address,String phonenumber,String emailaddress){
        super(name,address,phonenumber,emailaddress);
    }

    @Override
    public String toString() {
        return "Student"+"\t"+name;
    }
}
