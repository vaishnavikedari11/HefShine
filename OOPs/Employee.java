package OOPs;

public class Employee {
    //instance variable
    String empName;
    int empId;
    String empContactNumber;
    String empAdrress;
    //static variable
    static String empOrgName="TCS";

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.empName="Aniket";
        e1.empId=1;
        e1.empContactNumber="3286488964";
        e1.empAdrress="pune";
        Employee e2=new Employee();
        e2.empName="Ram";
        e2.empId=2;
        e2.empContactNumber="233445964";
        e2.empAdrress="pune";

        System.out.println("Employee Details = ");
        System.out.println("Employee 1 details - ");

        System.out.println(e1.empName);
        System.out.println(e1.empId);
        System.out.println(e2.empContactNumber);
        System.out.println(e2.empAdrress);
        System.out.println(empOrgName);

         
        System.out.println("Employee 2 details - ");
        System.out.println(e2.empName);
        System.out.println(e2.empId);
        System.out.println(e1.empContactNumber);
        System.out.println(e1.empAdrress);
        System.out.println(empOrgName);
        

    }
}
