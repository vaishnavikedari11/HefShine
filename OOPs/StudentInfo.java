package OOPs;

public class StudentInfo {
    int rollNo;
    int age;
    String name;
    String state;
    public StudentInfo(int rollNo,int age,String name,String state){
        this.rollNo=rollNo;
        this.age=age;
        this.name=name;
        this.state=state;
    }
    void displayInfo(){
        System.out.println("Roll number of studenet = "+rollNo);
        System.out.println("Age of the student ="+age);
        System.out.println("Name of the Student = "+name);
        System.out.println("State of student = "+state);
    }
    
    public static void main(String[] args) {
        StudentInfo s1=new StudentInfo(101, 19, "vaishnavi", "MH");
        s1.displayInfo();
    }
}
