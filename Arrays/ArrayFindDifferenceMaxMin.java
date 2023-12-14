package Array;

public class ArrayFindDifferenceMaxMin {
    public static void main(String[] args) {

        int array[] = { 11, 22, 66, 44, 77, 44, 55 };
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        int difference = max - min;
        System.out.println(difference);
    }
}
