package OOPs.Polymorohism;

public class ConstructorOverloading {
    String name;
    int id;
    String city;

    public ConstructorOverloading(String name){
        this.name=name;
    }
    public ConstructorOverloading(String name,int id){
        this(name);
        this.id=id;
    }
    public ConstructorOverloading(String name,int id,String city){
        this(name,id);
        this.city=city;
    }

    public static void main(String[] args) {
        ConstructorOverloading ob1=new ConstructorOverloading("Vaish",123,"MH");
        System.out.println("name = "+ob1.name);
        System.out.println("id = "+ob1.id);
        System.out.println("city = "+ob1.city);
        

    }
}
