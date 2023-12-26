package Pattern;
/*
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
 */
public class Pattern45 {
    public static void main(String[] args) {
        int spacecount=8;
        for(int i=1;i<=9;i++){
            int num=1;
            for(int j=1;j<=9;j++){
                if(j<=spacecount){
                    System.out.print(" ");
                    
                }else{
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
            spacecount--;
        }
    }
}
