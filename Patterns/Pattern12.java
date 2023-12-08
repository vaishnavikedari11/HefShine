package Pattern;
/*
    * * * * *
     * * * *
      * * *
       * *
        *
       * *
      * * *
     * * * *
    * * * * *
 */
public class Pattern12 {
    public static void main(String[] args) {
        int spacecount = 4;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j <= spacecount) {
                    System.out.print(" ");
                } else {
                    System.out.print("*" +" ");
                }
            }
            System.out.println();
            if(i<5){
                spacecount++;
            }else{
                spacecount--;
            }
        }
    }
}
