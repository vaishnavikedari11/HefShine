package Pattern;
/*
1
01
101
0101
10101
 */
public class Pattern60 {
    public static void main(String[] args) {
        int end=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=end;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
            end++;

        }
    }
}
