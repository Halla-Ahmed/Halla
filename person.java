public class person {
    String name, address,phonenumber, emailaddress;
    public person(){}
    public person(String name,String address,String phonenumber,String emailaddress){
        this.name=name;
        this.address=address;
        this.phonenumber=phonenumber;
        this.emailaddress=emailaddress;
    }

    @Override
    public String toString() {
        return "person"+"\t"+name;
    }
}
