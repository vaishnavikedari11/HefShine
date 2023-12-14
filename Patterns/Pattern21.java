package Pattern;
/*
    *****
     *****
      *****
       *****
        *****
 */
public class Pattern21 {
    public static void main(String[] args) {
        int end=5;
        int spaceCount=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=end;j++){
                if(j<=spaceCount){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            spaceCount++;
            end++;
        }
    }
}
