package Array;
public class ArrayFindMax{
    public static void main(String[] args) {
        int arr[]={11,66,22,44,77,33,55};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}