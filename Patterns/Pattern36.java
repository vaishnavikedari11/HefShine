package Pattern;
/*
    1 2 3 4 5
     2 3 4 5
      3 4 5
       4 5
        5
       4 5
      3 4 5
     2 3 4 5
    1 2 3 4 5
 */
public class Pattern36 {
    public static void main(String[] args) {
        int spacecount=4;
       int num=1;
        for(int i=1;i<=9;i++){
            int num2=num;
            for(int j=1;j<=9;j++){
                if(j<=spacecount){
                    System.out.print(" ");
                }else{
                    System.out.print(num2+" ");
                    num2++;
                }
            }
            System.out.println();

            if(i<5){
                spacecount++;
                num++;
            }else{
                spacecount--;
               num--;

            }
        }
    }
}