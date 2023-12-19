package OOPs.MultipleInherirance;

class Person {// grandparent
    String name;

    public Person(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
    }
}

class Employee extends Person {// person
    String designation;

    public Employee(String name, String designation) {
        super(name);
        this.designation = designation;
    }
    void displayDesignation(){
        System.out.println("Designation : "+designation);
    }
}
class Manager extends Employee{//child
    int teamSize;
    Manager(String name,String designation,int teamSize){
        super(name, designation);
        this.teamSize=teamSize;
    }
    void displayTeamSize(){
        System.out.println("TeamSize : "+teamSize);
    }
    
}
class HR extends Employee{
    int salary;
    HR(String name,String designation,int TeamSize,int salary){
        super(name,designation);
        this.salary=salary;
    }
    void displaySalay(){
        System.out.println("Salary : "+salary);
    }
}


public class MyMainClass {
    public static void main(String[] args) {
        Manager ob=new Manager("Vaish", "Manager", 12);
        ob.displayInfo();
        ob.displayDesignation();
        ob.displayTeamSize();
        HR ob1=new HR("ABC", "XYZ", 13, 12000);
        ob1.displayInfo();
        ob1.displayDesignation();
        ob1.displaySalay();
    }
}
