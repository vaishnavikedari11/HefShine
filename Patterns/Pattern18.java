package Pattern;
/*
 
 */
public class Pattern18 {
    public static void main(String[] args) {
        int end=5;
        int spacecount=0;
        for(int i=1;i<=9;i++){
        
            for(int j=1;j<=end;j++){
                if(j<=spacecount){
                    System.out.print(" ");
                }else{
                    if((i+j)%2!=0){
                        System.out.print(" ");
                    }else{

                        System.out.print("*");
                    }
                }
            }
            System.out.println();
            if(i<5){
                spacecount++;
                end--;
            }else{
                spacecount--;
                end++;
            }
        }
    }
}
