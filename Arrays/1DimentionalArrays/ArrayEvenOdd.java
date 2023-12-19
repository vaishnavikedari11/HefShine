package Array;

import java.util.Arrays;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        int evenCount=0;
        int oddCount=0;
        int array[]={11,22,33,44,66,77,22,55};
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        int even[]=new int[evenCount];
        int odd[]=new int[oddCount];

        int evenI=0;
        int oddI=0;

        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even[evenI]=array[i];
                evenI++;
            }else{
                odd[oddI]=array[i];
                oddI++;
            }

        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }
}
