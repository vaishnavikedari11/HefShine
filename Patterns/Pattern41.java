package Pattern;
/*
        1
       12
      123
     1234
    12345
   123456
  1234567
 12345678
123456789
 */
public class Pattern41 {
    public static void main(String[] args) {
        int spacecount=8;
      
        for(int i=1;i<=9;i++){
            int num=1;
            for(int j=1;j<=9;j++){
                if(j<=spacecount){
                    System.out.print(" ");
                }else{
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
            spacecount--;
            
        }
    }
}
