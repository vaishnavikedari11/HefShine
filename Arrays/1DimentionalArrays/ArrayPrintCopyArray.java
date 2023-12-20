package Array;

public class ArrayPrintCopyArray {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50};
        int array2[]=new int[array.length];
        for(int i=0;i<array.length;i++){
            array2[i]=array[i];
        }
        //printing array element
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
    }
}
