package Array;
import java.util.*;
//there are two ways to print array
//1-by using value-this used when value are given or known to us
//2-by using new keyword -this is used when we don't know what are values that we have to put in array
// int[]arrayname=new int[arraysize];
//new keyword can alloacate blank memory
public class ArrayBlank {
    public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=10;
        array[1]=20;
        System.out.println(Arrays.toString(array));
    }
}
