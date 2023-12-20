package Pattern;
/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 */
public class Pattern29 {
    public static void main(String[] args) {
        int spacecount=4;
        
        for(int i=1;i<=5;i++){
            int num=1;
            for(int j=1;j<=5;j++){
                
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
