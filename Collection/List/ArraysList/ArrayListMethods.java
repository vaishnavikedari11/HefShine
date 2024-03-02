package Collection.ArrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(13);
        al.add(43);
        al.add(45);
        //reverse() method
        Collections.reverse(al);
        System.out.println("Reverse arrayList = "+al);
        //sort() method
        Collections.sort(al);
        System.out.println("Sorted arrayList = "+al);
        //shuffle() method
        Collections.shuffle(al);
        System.out.println("Shuffule arraylist = "+al);
        //remove() method
        al.remove(2);
        System.out.println("Remove 3 rd element from arraylist = "+al);

        
        //set() method
        al.set(0, 100);
        System.out.println("set element at 0=100 = "+al);
        //reteive element-get () method
        System.out.println("retrive element from arraylist = "+al.get(0));
        //add element at index
        al.add(1,200);
        al.add(2, 300);
        System.out.println("print added element arraylist = "+al);
        //Add arraylist in other arraylist addAll() method
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(21);
        al1.add(31);
        al1.add(41);
        al1.add(51);
        al1.add(61);
        System.out.println("Adding arraylist in other arraylist = "+al.addAll(al1));
        //print portion of the arraylist
        
        List<Integer>sublist=al.subList(2, 5);
        System.out.println("Portion of arrayList = "+sublist);
        //other way
        ArrayList<Integer>al2=new ArrayList<>(al);
        System.out.println("adding other arraylist in first arraylist = "+al2);
        //comapare two arrayist equals() method
        System.out.println("comparing two arraylist = "+ al.equals(al1));
        //clone ()
        ArrayList<Integer> newAl=(ArrayList<Integer>)al.clone();
        System.out.println("clone of arraylist"+newAl);



    }   
}
