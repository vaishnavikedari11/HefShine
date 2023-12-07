package Pattern;
/*
*****
 ****
  ***
   **
    *
 */
public class Pattern8 {
    public static void main(String[] args) {
        int spacecount = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= spacecount) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            spacecount++;
        }
    }
}
