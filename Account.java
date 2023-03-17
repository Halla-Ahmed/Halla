import java.util.Date;

public class Account {
    private int id=0;
    private double balance=0.0;
    private static double annualIntersetRate=0;
    private Date dateCreated;
    public Account(){
        dateCreated=new Date();}
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
        dateCreated=new Date();
    }
    public int getId(){
        return id;}
    public void setId(int id){
        this.id=id;}
    public double getBalance(){
        return balance;}
    public void setBalance(double balance){
        this.balance=balance;}
    public double getAnnualIntersetRate(){
        return annualIntersetRate;}
    public void setAnnualIntersetRate(double annualIntersetRate){
        this.annualIntersetRate=annualIntersetRate;}
    public Date getDateCreated(){
        return dateCreated;}
    public double getMonthIntersetRate(){
        return (annualIntersetRate / 100) / 12;}
    public double getMonthlyInterset(){
        return balance*getMonthIntersetRate();}
    public void withdraw(double amount){
        balance-=amount;}
    public void deposit(double amount){
        balance+=amount;}
}
