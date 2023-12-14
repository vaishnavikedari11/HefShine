package Pattern;
/*
**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********
 */
public class Pattern23 {
    public static void main(String[] args) {
        int fEnd=5;
        int sStart=6;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=10;j++){
                if(j<=fEnd || j>=sStart){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i<5){
                fEnd--;
                sStart++;
            }else{
                fEnd++;
                sStart--;
            }

        }
    }
}
