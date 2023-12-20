package Array;

public class ArrayFindMinIndex {
    public static void main(String[] args) {

        int array[] = { 11, 8, 33, 44, 7, 44, 77, 55 };
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
