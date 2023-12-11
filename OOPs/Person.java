package OOPs;

public class Person {
    String name;
    int age;
    String state;
    Person(){
        name=null;
        age=0;
        state=null;
    }
    Person(String n,int a,String s){
        name=n;
        age=a;
        state=s;
    }
    //copy constructor
    Person(Person p1){
        name=p1.name;
        age=p1.age;
        state=p1.state;

    }
    void displayData(){
        System.out.println(name+" "+age+" "+state);
    }
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person(p1);
        Person p3=new Person();
        Person p4=new Person("Suresh",32,"UP");
        p1.name="Akash";
        p1.age=27;
        p1.state="MH";
        p1.displayData();
        p2.displayData();
        p3.displayData();
        p4.displayData();

    }
}
