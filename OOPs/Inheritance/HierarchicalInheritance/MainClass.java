package OOPs.HirachicalInheritance;
//multiple inheritance is not supported in java so hybrid iinheritance is also not supported.
import java.lang.ref.Cleaner.Cleanable;

class Person{
    String name;
    public Person(String name){
        this.name=name;
    }
    void displayInfo(){
        System.out.println("Name : "+name);
    }
}
class Employee extends Person{
    String designation;
    public Employee(String name,String designation){
        super(name);
        this.designation=designation;
    }
    void displayDesignation(){
        System.out.println("Designation : "+designation);
    }
}
class Manager extends Employee{
    int teamSize;
    public Manager(String name,String designation,int teamSize){
        super(name,designation);
        this.teamSize=teamSize;
    }
    void displayTeamSize(){
        System.out.println("TeamSize : "+teamSize);
    }
}
class Clerk extends Employee{
    int deskNo;
    public Clerk(String name,String designation,int deskNo){
        super(name,designation);
        this.deskNo=deskNo;
    }
    void displayClerkInfo(){
        System.out.println("deskNo : "+deskNo);
    }
}


public class MainClass {
    public static void main(String[] args) {
        Clerk ob=new Clerk("Ajay", "clerk", 213093);
        ob.displayInfo();
        ob.displayDesignation();
        ob.displayClerkInfo();
        System.out.println("---------------------------------");
        Manager m1=new Manager("kehsav", "Manager", 0231341);
        m1.displayInfo();
        m1.displayDesignation();
        m1.displayTeamSize();
    }
}
