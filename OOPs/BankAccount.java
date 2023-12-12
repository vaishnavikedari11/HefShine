package OOPs;
//1.create a class name'bank account
//2.include following attributes in the class bank account
//1-accno,2-acholder,3-balance
//3.implement the constuctor or bank acc class .the constructor should take parameters like-accNo,aaholder,balance
//4.initialise the corresponding attributes with the provided values
//include a method called display information that prints the accdetails i.e., accno,accholder,balance
//make method of depositevname-
//withdraw method which decreses the balance by the specified ammount
//execute methods to demonstrate the basic transactions.
public class BankAccount {
    int accNo;
    String accHolder; 
    float balance;

    BankAccount(int an,String ah,float b){
        accNo=an;
        accHolder=ah;
        balance=b;
    }
    void displayInfo(){
        System.out.println("Inforamation of account holder = ");
        System.out.println("Account number = "+accNo);
        System.out.println("Account Holder name = "+accHolder);
        System.out.println("Account balance = "+balance);
    }
    void deposite(int amount){
        balance=balance+amount;
    }
    void withdraw(int amount){
        balance=balance-amount;
    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount(1234, "vaishnavi", 1200f);
        b1.displayInfo();
    }
}
