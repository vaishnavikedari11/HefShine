package TwoDArrays;

public class MinElement {
    public static void main(String[] args) {

        int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(min);
    }

}
