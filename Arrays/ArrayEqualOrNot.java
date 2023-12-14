package Array;

public class ArrayEqualOrNot {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        int arrayb[]={1,2,3,4,6,6,7};
        //check size of array
        //check each ele of array
        int count=0;
        if(array.length==arrayb.length){
            System.out.println("length of both array is same .");
            for(int i=0;i<array.length;i++){
                if(array[i]==arrayb[i]){
                    count++;
                }else{
                    System.out.println("elements of these arrays is not equal.");
                }
            }
            if(count==array.length){
                System.out.println("these arrays are equal");
            }else{
                System.out.println("arrays are not equal");
            }
        }else{
            System.out.println("length of two arrays is not same");
        }
    }
}
