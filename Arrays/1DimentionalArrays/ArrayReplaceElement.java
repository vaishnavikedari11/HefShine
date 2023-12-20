package Array;
import java.util.Arrays;

public class ArrayReplaceElement {
    public static void main(String[] args) {
        int array[]={1,0,1,0,1,0,1};
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                array[i]=1;
            }
        }
        System.out.println(Arrays.toString(array));
        //another
        for(int i=0;i<=array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
