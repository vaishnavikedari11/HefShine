package Collection.ArrayList;
import java.util.*;
public class ArrayListIterate {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        //iterate by using for each loop
        //for(data type where we store : from which we have to iterate data){}
        for(int data:al){
            System.out.println(data);
        }
        //iterate by using while loop
        int j=0;
        while(j<al.size()){
            System.out.println(al.get(j));
            j++;
        }
        //iterate by using for loop
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

    }
}
