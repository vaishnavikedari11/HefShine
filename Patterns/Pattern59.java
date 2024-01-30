package Pattern;
/*
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
 */
public class Pattern59 {
    public static void main(String[] args) {
        int firstTriEnd = 1;
        int secondTriStart = 9;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (firstTriEnd >= j || secondTriStart <= j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < 5) {
                firstTriEnd++;
                secondTriStart--;
            } else {
                firstTriEnd--;
                secondTriStart++;

            }
        }
    }
}
