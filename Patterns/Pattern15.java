package Pattern;
/*
*********
 *******
  *****
   ***
    *

 */
public class Pattern15 {
    public static void main(String[] args) {
        int end=9;
        int spacecount=0;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=end;j++){
                if(j<=spacecount){
                    System.out.print(" ");
                }else{

                    System.out.print("*");
                }
            }
            System.out.println();
            spacecount++;
            end--;

        }
    }
}
