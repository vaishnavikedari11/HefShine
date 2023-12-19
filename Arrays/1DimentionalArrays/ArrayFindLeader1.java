package Array;

public class ArrayFindLeader1 {
    public static void main(String[] args) {
        int array[]={88,44,55,22,77,66,33};
        int max=array[array.length-1];
        System.out.println(max);
        for(int i=array.length-1;i>=0;i--){
            if(array[i]>max){
                max=array[i];
                System.out.println(max);
            }
        }
    }
}
