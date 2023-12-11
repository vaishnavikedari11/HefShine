package OOPs;
//5 student deatils
//initialized with constructors
//create method to display total marks
//calculate percentage

public class Student {
    int studentId;
    String studentName;
    int sub1,sub2,sub3;

    Student(int i,String n,int s1,int s2,int s3){
        studentId=i;
        studentName=n;
        sub1=s1;
        sub2=s2;
        sub3=s3;
    }
    void displayMarks(){
        System.out.println("Total Marks = "+sub1+sub2+sub3);
    }
    int calPercentage(){
        int totalMarks=sub1+sub2+sub3;
        int per=(totalMarks*100)/300;
        return per;

    }


    public static void main(String[] args) {
        Student s1=new Student(1, "Shiva", 43, 65, 54);
        s1.displayMarks();
       System.out.println("Percentage = "+s1.calPercentage());
    }
}
