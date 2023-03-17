public class Faculty extends Employee{
    int officehours,rank;
    public Faculty(int officehours,int rank,String office,double salary,String name,String address,String phonenumber,String emailaddress){
        super(office, salary, name, address, phonenumber, emailaddress);
        this.officehours=officehours;
        this.rank=rank;
    }

    @Override
    public String toString() {
        return "Faculty"+"\t"+name;
    }
}
