package Collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class FindUnique {
    public static void main(String[] args) {
        int a[]={11,22,33,44,55,11,22,33,33};

        LinkedHashSet<Integer> set=new LinkedHashSet<>();

        for(int data:a){
            set.add(data);
        }
        System.out.println("Unique elements in array = "+set);
    }
}
