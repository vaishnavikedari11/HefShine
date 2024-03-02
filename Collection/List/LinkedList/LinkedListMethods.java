package Collection.LinkedList;
import java.util.*;
//LinkedList is fast for removing element adding element
//LinedList is slow get element and set element.
//LinkedList follows insersion order
//head=starting element of the LinkedList
//tale=last elemnet of the LinkedList
//Node= it is class we use it in LinkedList for making object of that class

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer>llist1=new LinkedList<>();
        //adding elemnet in ll
        llist1.add(11);
        llist1.add(12);
        llist1.add(13);
        llist1.add(14);
        llist1.add(15);
        //printing LinkedList
        System.out.println(llist1);

        LinkedList<Integer>llist2=new LinkedList<>();
        llist2.add(21);
        llist2.add(22);
        llist2.add(23);
        llist2.add(24);

        //using set()method
        llist1.set(1, null);
        System.out.println("Element set at 1 index = "+llist1);
        //covert into arraylist
        ArrayList<Integer>al=new ArrayList<>(llist1);
        System.out.println("Conversion linkedlist to arraylist = "+al);
        //contains()method -to find element is present in list or not
        System.out.println("tell element is present in list or not = "+llist1.contains(66));
        //for getting first element getFirst() method
        System.out.println("first elemenet of list = "+llist1.getFirst());
        //for getting last element of list getLast() method
        System.out.println("lasst element of list = "+llist1.getLast());
        //set element using set() method
        System.out.println("set elemnet at 1 index = "+llist1.set(1, 12));
        //adding element and removing elemet  using poll() method=it can print first elemet of list and remove it from list.
        int ele=llist1.poll();
        System.out.println("First element of list = "+ele);
        System.out.println("after removing first element = "+llist1);
        //clone of the list using clone() method
        LinkedList<Integer>llist3=(LinkedList<Integer>)llist2.clone();
        System.out.println("clone linkedlist = "+llist3);
        //adding all element using addAll() method
        System.out.println("adding all element of list = "+llist1.addAll(llist2));
        //Reverse  using reverse()method
        Collections.reverse(llist1);
        System.out.println("Reverse LinkedList = "+llist1);
        //iterating element in descending order using descedingIterator() method
        Iterator<Integer>It=llist1.descendingIterator();
        System.out.println("descending iterator = "+It);
        //
        while(It.hasNext()==true){
            System.out.println(It.next());
        }
        //remove first element
        llist1.removeFirst();
        //remove last element
        llist1.removeLast();
        System.out.println(llist1);
        //remove element at index 1
        llist2.remove(1);
        System.out.println(llist2);
        //
        for(int i=0;i<llist1.size();i++){
            System.out.println(llist1.get(i)+" "+i);
        }
        //
        System.out.println(llist1.indexOf(30));
        System.out.println(llist1.lastIndexOf(30));
        //
        llist1.add(2,100);
        System.out.println("After adding element 100 at index 2 = "+llist1);
        //
        llist1.addFirst(100);
        llist1.addLast(200);
        System.out.println("After adding element at first 100 and at last 200 = "+llist1);


        

    }
}
