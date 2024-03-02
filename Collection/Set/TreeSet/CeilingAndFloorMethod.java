import java.util.TreeSet;

public class CeilingAndFloorMethod {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);
        ts.add(9);
        ts.add(13);
        ts.add(18);
        ts.add(2);
        ts.add(23);
        //ceiling() =  this can gave us greater value than the given number from treeset but it gives less greater value .
        //if that value is not present then it will print less greater value  
        //but if that value is present then it return that value
        System.out.println("Greater than given value = "+ts.ceiling(10));
        //fllor() = it can gave us less than value from the given number but it gives less greater value
         //if that value is not present then it will print  greater less  value  
        //but if that value is present then it return that value
        System.out.println("Less than Given value = "+ts.floor(13));
    }
}
