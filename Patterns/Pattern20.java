package Pattern;
//     *****
//    *****
//   *****
//  *****
// *****
public class Pattern20 {
    public static void main(String[] args) {
        int end=9;
        int spaceCount=4;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=end;j++){
                if(j<=spaceCount){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
            spaceCount--;
            end--;

        }
    }
}
