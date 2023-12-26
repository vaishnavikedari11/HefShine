package Pattern;
/*
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
 */
public class Pattern44 {
    public static void main(String[] args) {
        int spacecount=8;
        
        int num=1;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j<=spacecount){
                    System.out.print(" ");
                }else{
                    System.out.print(num+" ");
                }
            }
            System.out.println();
            spacecount--;
            
            num++;
        }
    }
}
