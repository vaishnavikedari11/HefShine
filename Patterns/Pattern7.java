package Pattern;
/*
    *
   **
  ***
 ****
*****
 */
public class Pattern7 {
    public static void main(String[] args) {

        int spaceCount = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (j <= spaceCount) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            spaceCount--;
        }
    }
}
