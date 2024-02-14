package TwoDArrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int array[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
                    //row
                for(int i=0;i<array.length;i++){
                    //column
                    for(int j=0;j<array[i].length;j++){
                        System.out.print(array[i][j]);
                    }
                    System.out.println();
                }
    }
}
