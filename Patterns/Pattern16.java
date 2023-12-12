package Pattern;
/*
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
 */
public class Pattern16 {
    public static void main(String[] args) {
        int spacecount=0;
        int end=9;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=end;j++){
                if(j<=spacecount){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }System.out.println();
            if(i<5){
                spacecount++;
                end--;
            }else{
                spacecount--;
                end++;
            }

        }
    }
}
