package Array;

public class ArrayFindMin {
    public static void main(String[] args) {
        
    
    int array[]={11,66,22,44,77,33,55};
    int min=array[0];
    for(int i=1;i<array.length;i++){
        if(array[i]<min){
            min=array[i];
        }
        
    }
    System.out.println(min);
}

}
