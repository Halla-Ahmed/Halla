import java.util.Date;

public class Employee extends person{
    String office;
    double salary;
    Date datehired;
    public Employee(String office,double salary,String name,String address,String phonenumber,String emailaddress){
        super(name, address, phonenumber, emailaddress);
        this.office=office;
        this.salary=salary;
    }


    public String toString() {
        return "Employee"+name;
    }
}
