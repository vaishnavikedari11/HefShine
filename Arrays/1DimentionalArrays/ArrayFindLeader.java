package Array;

public class ArrayFindLeader {
    public static void main(String[] args) {
        int array[]={88,44,55,22,66,77,33};
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    count++;
                }
            }
            if(count==0){
                System.out.println(array[i]);
            }
        }
    }
}
