package Pattern;
/*
9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1
 */
public class Pattern46 {
    public static void main(String[] args) {
        int spacecount=0;
        int num=9;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j<=spacecount){
                    System.out.print(" ");
                }else{
                    System.out.print(num+" ");
                }
            }
            System.out.println();
            spacecount++;
            num--;

        }
    }
}
