package Pattern;
/*
1
12
123
1234
12345
 */
public class Pattern24 {
    public static void main(String[] args) {
        int end=1;
       // int count=1;
        for(int i=1;i<=5;i++){
            int count=1;
            for(int j=1;j<=end;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
            end++;
            
        }
    }
}
