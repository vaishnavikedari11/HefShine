package Array;
public class ArrayFindIndex {
    public static void main(String[] args) {
        int array[]={11,22,33,44,55,33,77};
        int data=33;
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==data){
                System.out.println("Index of Element = "+i);
                count++;
            }

        }
        if(count==0){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found, count of element = "+count);
        }
    }   
}
