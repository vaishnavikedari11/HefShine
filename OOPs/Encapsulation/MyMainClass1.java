package OOPs.Encapsulation;

public class MyMainClass1 {
    public static void main(String[] args) {
        Employee ob=new Employee();
        ob.setEName("Vaish");
        System.out.println(ob.getEName());
        ob.setEId(1);
        System.out.println(ob.getEId());
        ob.setESalary(12000);
        System.out.println(ob.getESalary());
        ob.setEDesk(12);
        System.out.println(ob.getEDesk());
        ob.setEPassword(1213432);
        System.out.println(ob.getEPassword());

    }
}
