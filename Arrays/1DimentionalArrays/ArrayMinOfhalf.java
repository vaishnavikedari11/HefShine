package Array;
//index finding =
public class ArrayMinOfhalf {
    public static void main(String[] args) {
        int array[]={11,8,22,44,7,3,55};
        int min=3;
        for(int i=4;i<array.length;i++){
            if(array[i]<array[min]){
                min=i;
            }
        }
        System.out.println(min);

        //or
        int minhalf=(array[array.length]/2);
    }
}
