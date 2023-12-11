package OOPs;
public class Constructor4 {
    int empId;
    String name;
    float hra,pf,totalSalary;
    
    Constructor4(int Id,String n,float h,float p){
        empId=Id;
        name=n;
        hra=h;
        pf=p;
    }
    void display(){
        System.out.println(empId+" "+name+" "+hra+" "+pf);
        System.out.println("Total Salary ="+calSal());
    }
    float calSal(){
        return totalSalary=hra+pf;
    }
    public static void main(String[] args) {
        Constructor4 emp1=new Constructor4(1,"vais",1233f,5321f);
        emp1.display();

        


    }
}
