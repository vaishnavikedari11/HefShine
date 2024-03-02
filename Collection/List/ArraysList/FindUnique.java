package Collection.ArrayList;

import java.util.ArrayList;

public class FindUnique {
    public static void main(String[] args) {
        int a[]={11,22,33,44,55,11,22,33,44};

        ArrayList<Integer> al=new ArrayList<>();
        for(int data:a){
            if(al.contains(data)==true){
                continue;
            }else{
                al.add(data);
            }
        }
        System.out.println("Unique elements in ararya = "+al);
    }
}
