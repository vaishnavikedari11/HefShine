package Collection.ArrayList;
// 1-Arraylist can maintain Insertion order-means it can give element as user add 
// 2-Arraylist contains duplicate elements
// 3-size of arraylist is dynamic
// 4-Arraylist work on index
//5 -Arrays store null value
// 6- adding of element at specific index and removing becomes slow.
// 7 -Getting elements form arrays becomes fast
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
    }
}
