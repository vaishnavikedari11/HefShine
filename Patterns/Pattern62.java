package Pattern;
/*
 *** 
*   *
*   *
*   *
*   *
*   *
 *** 
 */
public class Pattern62 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=5;j++){
                if((i>=2 && i<=6 && j==1)||(i>=2 && i<=6 && j==5)||(i+j==3 )|| (j-i==3 )||(j==3 && i==1)||(j==3 && i==7)||(j-i==-5)||(j+i==11)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
