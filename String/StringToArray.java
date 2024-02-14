package StringFolder;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String s1="hefshine";
        //by using toCharArray ()method
        char ca[]=s1.toCharArray();
        System.out.println(Arrays.toString(ca));
        //by using for loop
        char ca2[]=new char[s1.length()];
        for(int i=0;i<s1.length();i++){
            ca2[i]=s1.charAt(i);
        }
        System.out.println(Arrays.toString(ca2));
    }
}
