import java.util.*;
//treeset can not follows insertion order
//treeset follows sorting order
//it can not add null value 
//it follows left-self-right
public class TreeSetMethod {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);
        ts.add(9);
        ts.add(13);
        ts.add(18);
        ts.add(2);
        ts.add(23);

        System.out.println("TreeSet elements = " + ts);
        // convert treeset to arraylist
        ArrayList<Integer> al = new ArrayList<>(ts);
        System.out.println("TreeSet to ArrayList = " + al);
        // treeset in reverse order
        Iterator<Integer> it = ts.descendingIterator();
        while (it.hasNext() == true) {
            System.out.println("TreeSet in reverse order = " + it.next());
        }
        //Iterate Treeset
        Iterator<Integer> it1=ts.iterator();
        while(it1.hasNext()==true){
            System.out.println("Iterating TreeSet by using Iterator = "+it1.next());
        }
        //Iterate treeset by using for each loop
        for(int data :ts){
            System.out.println("Iterating Treeset by using For Each loop = "+data);
        }
        //add all elements by addAll()method
        TreeSet<Integer> ts2 = new TreeSet<>();
        System.out.println("AddAll elements in other treeSet = "+ts2.addAll(ts));
        //last() = return last elemnt and it will be the greater elemnet in treeset
        System.out.println("Last element in treeset = "+ts.last());
        //first() = return first elemnt and it will be the greater elemnet in treeset
        System.out.println("first element in treeset = "+ts.first());

    

    }
}
