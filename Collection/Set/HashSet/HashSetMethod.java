package Collection.Set.HashSet;
import java.util.*;


//set is interface
//it has three types 1-HashSet  2-treeSet 3-LinkedHashSet
//
public class HashSetMethod {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(44);
        set.add(55);
        set.add(66);
        set.add(77);
        System.out.println("iterating HashSet");
        //iterating set
        //by using terator
        Iterator<Integer>it=set.iterator();
        while (it.hasNext()==true) {
            System.out.println(it.next());
        }
        System.out.println("--------------------------------------");
        //by using for each loop
        for(int data:set){
            System.out.println(data);
        }
        
    }
}
