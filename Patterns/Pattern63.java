package Pattern;
/*
 *** 
*   *
*   *
*****
*   *
*   *
*   *
 */
public class Pattern63 {
   public static void main(String[] args) {
    for(int i=1;i<=7;i++){
        for(int j=1;j<=5;j++){
            if((i+j==3)||(j-i==3)||(i>=2 && j==1)||(i>=2 && j==5)||(i==4)||(j==3 && i==1)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   } 
}
