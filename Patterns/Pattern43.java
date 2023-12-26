package Pattern;
/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1
 */
public class Pattern43 {
    public static void main(String[] args) {
        int spacecount=4;
        int end=5;
        int num=1;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=end;j++){
                if(j<=spacecount){
                    System.out.print(" ");
                }else{
                    System.out.print(num+" ");
                }
            }
            System.out.println();
            if(i<5){
                spacecount--;
                num++;
                
            }else{
                spacecount++;
                num--;
            }
        }
    }
}
